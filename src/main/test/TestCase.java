import com.scdn.domain.User;
import com.scdn.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestCase {
    private static Logger logger=Logger.getLogger(TestCase.class);
    @Resource
    private UserService userService =null;
    @Test
    public void test1(){
        //System.out.println(userService);
        User user=userService.findById(1);
        logger.info(user);
    }
}
