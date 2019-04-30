import com.study.services.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by idodo-i7-01 on 2019/4/26.
 */

//
//public class TestDemo {
//    @Test
//    public void testCase() {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        UserService userService = (UserService) applicationContext.getBean("userService");
//        System.out.println(userService.queryUserName(1));
//    }
//}

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class TestDemo {
    @Autowired
    private UserService userService;
    @Test
    public void testCase() {
        System.out.println(userService.queryUserName(1));
    }
}

