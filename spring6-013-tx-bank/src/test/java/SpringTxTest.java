import com.lzc.bank.pojo.Account;
import com.lzc.bank.service.AccountService;
import com.lzc.bank.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title: SpringTxTest
 * @Author luozouchen
 * @Date: 2022/11/7 19:57
 */
public class SpringTxTest {
    @Test
    public void testSpringTx() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        try {
            accountService.transfer("act-001", "act-002", 10000);
            System.out.println("转账成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("转账失败");
        }
    }

    //传播行为
    @Test
    public void testPropagation() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //获取1号Service对象
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        Account act = new Account("act-003", 1000.0);
        accountService.save(act);
    }

}
