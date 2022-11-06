import com.lzc.biz.UserService;
import com.lzc.biz.VipService;
import com.lzc.service.AccountService;
import com.lzc.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title: AopRealAppTest
 * @Author luozouchen
 * @Date: 2022/11/6 16:41
 */
public class AopRealAppTest {
    @Test
    public void testTransaction() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        accountService.transfer();
        accountService.withdraw();
        orderService.generate();
        orderService.cancel();
    }

    @Test
    public void testSerurityLog(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        VipService vipService = applicationContext.getBean("vipService", VipService.class);
        userService.saveUser();
        userService.deleteUser();
        userService.updateUser();
        userService.selectUser();

        vipService.saveVip();
        vipService.deleteVip();
        vipService.updateVip();
        vipService.selectVip();
    }
}
