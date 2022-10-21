package Date10_20.Factory;

import Date10_20.dao.Factory.UserDaoFactory;
import Date10_20.dao.Factory.UserDao;
import Date10_20.domain.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)  // spring에서 테스트 하기 위한 설정
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {
                    // 싱글톤을 위해 Autowired 사용
    @Autowired      // 새로운 객체를 사용하지 않고 이전에 사용했던 객체의 주소를 그대로 사용한다는 설정
                    // new 객체 생성을 한번만 사용함(고정값)
    ApplicationContext context; // Spring ApplicationContext를 사용하기 위해서는
    // @ExtendWith 과 @ContextConfiguration를 추가해줘야 한다.

    @Test
    void addAndSelect() throws ClassNotFoundException, SQLException {
        User user1 = new User("1","홍길동","1234");
        User user2 = new User("2","이순신","4567");
        User user3 = new User("3","세종","7896");

        UserDao userDao = context.getBean("awsUserDao", UserDao.class);     // bean 파일에서 awsUserDao 메서드를 가져온다
      //  UserDao userDao1 = context.getBean("awsUserDao",UserDao.class);      userDao와 같은 객체를 사용함
        
        userDao.deleteAll();
        Assertions.assertThat(0).isEqualTo(userDao.getCount());

        String id = "3";
        userDao.add(user1);
        Assertions.assertThat(1).isEqualTo(userDao.getCount());

        User user = userDao.select(id);

        Assertions.assertThat("Spring").isEqualTo(user.getName());
   //     assertEquals("Spring",user.getName());
    }

    @Test
    void count(){

    }
}