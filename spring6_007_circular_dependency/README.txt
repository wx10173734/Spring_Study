源码分析:
DefaultSingletonBeanRegistry类中有三个比较重要的缓存:
private final Map<String，0bject> singleton0bjects  一级缓存
private final Map<String， Object> earlySingLeton0bjects  二级缓存
private final Map<String, ObjectFactory<?>> singLetonFactories  三级缓存

这三个缓存都是Map集合。
Map集合的key存储的都是bean的name (bean id) 。
一级缓存存储的是:单例Bean对象。 完整的单例Bean对象，也就是说这个缓存中的Bean对象的属性都已经赋值了。是-个完 整的Bean对 象。
二级缓存存储的是:早期的单例Bean对象。这个缓存中的单例Bean对象的属性没有赋值。只是一一个早期的实例对象。
三级缓存存储的是:单例工厂“对象。这个里面存储了大量的“工厂对象”，每一一个单例Bean对象都会对应一个单例工厂 对象。
                           这个集合中存储的是，创建该单例对象时对应的那个单例工厂“对象。