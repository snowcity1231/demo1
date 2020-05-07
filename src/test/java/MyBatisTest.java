import com.xc.mybatis.mapper.PersonMapper;
import com.xc.mybatis.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class MyBatisTest {

    @Autowired
    PersonMapper personMapper;

    @Test
    public void addTest() {
        Person p = new Person();
        p.setName("Jerry");
        System.out.println(personMapper.add(p));;
    }
}
