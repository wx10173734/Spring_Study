package org.myspringframework.core;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @title: ClassPathXmlApplicationContext
 * @Author luozouchen
 * @Date: 2022/10/31 18:28
 */
public class ClassPathXmlApplicationContext implements ApplicationContext {
    private static final Logger logger = LoggerFactory.getLogger(ClassPathXmlApplicationContext.class);
    private Map<String, Object> singletonObjects = new HashMap<>();

    /**
     * 解析Myspring的配置文件，初始化所有的bean对象
     *
     * @param configLocation Spring配置文件的路径 注意:使用ClassPathXmlApplicationContext,配置文件应当放到类路径下
     */
    public ClassPathXmlApplicationContext(String configLocation) {
        try {
            //解析myspring.xml文件，然后实例化bean,将bean存放到singletonObject集合中
            //这是dom4j解析Xml文件的核心对象
            SAXReader reader = new SAXReader();
            //获取一个输入流，指向配置文件
            InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream(configLocation);
            //读文件
            Document document = reader.read(in);
            //获取所有的bean标签
            List<Node> nodes = document.selectNodes("//bean");
            //遍历bean标签
            nodes.forEach(node -> {
                try {
                    //向下转型的目的是为了使用element接口里面更丰富的方法
                    Element beanElt = (Element) node;
                    //获取id属性
                    String id = beanElt.attributeValue("id");
                    //获取class属性
                    String className = beanElt.attributeValue("class");
                    logger.info("beanName=" + id);
                    logger.info("beanClassName=" + className);
                    //通过反射机制创建对象，将其放到map集合中提前曝光
                    //获取class
                    Class<?> aClass = Class.forName(className);
                    //获取无参构造方法
                    Constructor<?> defaultCon = aClass.getDeclaredConstructor();
                    //调用无参构造方法实例化bean
                    Object bean = defaultCon.newInstance();
                    //将bean曝光，加入map集合
                    singletonObjects.put(id, bean);
                    //记录日志
                    logger.info(singletonObjects.toString());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            });

            //再次重新把所有的bean标签遍历一次，这一次主要是给对象的属性赋值
            nodes.forEach(node -> {
                try {
                    Element beanElt = (Element) node;
                    //获取id
                    String id = beanElt.attributeValue("id");
                    //获取className
                    String className = beanElt.attributeValue("class");
                    //获取class
                    Class<?> aClass = Class.forName(className);
                    //获取bean标签下所有的属性property标签
                    List<Element> propertys = beanElt.elements("property");
                    //遍历所有的属性标签
                    propertys.forEach(property -> {
                        try {
                            //获取属性名
                            String propertyName = property.attributeValue("name");
                            logger.info("属性名:" + propertyName);
                            //获取属性类型
                            Field field = aClass.getDeclaredField(propertyName);
                            //获取set方法名
                            String setMethodName = "set" + propertyName.toUpperCase().charAt(0) + propertyName.substring(1);
                            logger.info("属性set方法名:" + setMethodName);
                            //获取set方法
                            Method setMethod = aClass.getDeclaredMethod(setMethodName, field.getType());
                            //获取具体的值
                            String value = property.attributeValue("value");
                            Object actualValue = null;//真值
                            String ref = property.attributeValue("ref");
                            if (value != null) {
                                //说明值是简单类型
                                //调用set方法(set没有返回值)
                                //我们myspring框架声明一下:我们只支持这些类型为简单类型
                                // byte short int long float double boolean char
                                // Byte Short Integer Long FLoat Double Boolean Character
                                // String
                                //获取属性类型名
                                String propertyTypeSimpleName = field.getType().getSimpleName();//"String"
                                switch (propertyTypeSimpleName) {
                                    case "byte":
                                    case "Byte":
                                        actualValue = Byte.valueOf(value);
                                        break;
                                    case "short":
                                    case "Short":
                                        actualValue = Short.valueOf(value);
                                        break;
                                    case "int":
                                    case "Integer":
                                        actualValue = Integer.valueOf(value);
                                        break;
                                    case "long":
                                    case "Long":
                                        actualValue = Long.valueOf(value);
                                        break;
                                    case "float":
                                    case "Float":
                                        actualValue = Float.valueOf(value);
                                        break;
                                    case "double":
                                    case "Double":
                                        actualValue = Double.valueOf(value);
                                        break;
                                    case "boolean":
                                    case "Boolean":
                                        actualValue = Boolean.valueOf(value);
                                        break;
                                    case "char":
                                    case "Character":
                                        actualValue = value.charAt(0);
                                        break;
                                    case "String":
                                        actualValue = value;
                                        break;
                                }
                                setMethod.invoke(singletonObjects.get(id), actualValue);
                            }
                            if (ref != null) {
                                //说明值是非简单类型
                                //调用set方法(set没有返回值)
                                setMethod.invoke(singletonObjects.get(id), singletonObjects.get(ref));
                            }


                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }


                    });
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 根据bean的名称获取对应的bean对象
     *
     * @param beanName myspring配置文件中Bean标签的Id
     * @return 对应的单例bean对象
     */

    @Override
    public Object getBean(String beanName) {
        return singletonObjects.get(beanName);
    }
}
