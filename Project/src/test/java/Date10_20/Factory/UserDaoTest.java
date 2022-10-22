package Date10_20.Factory;

import Date10_20.dao.Factory.UserDaoFactory;
import Date10_20.dao.Factory.UserDao;
import Date10_20.domain.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(SpringExtension.class)  // spring에서 테스트 하기 위한 설정
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {
                    // 싱글톤을 위해 Autowired 사용
    @Autowired      // 새로운 객체를 사용하지 않고 이전에 사용했던 객체의 주소를 그대로 사용한다는 설정
                    // new 객체 생성을 한번만 사용함(고정값)
    ApplicationContext context; // Spring ApplicationContext를 사용하기 위해서는
    // @ExtendWith 과 @ContextConfiguration를 추가해줘야 한다.
    UserDao userDao;
    User user1;
    User user2;
    User user3;
    
    @BeforeEach
    void setUp(){       // 각각의 테스트 시작전 필수로 동작하는 부분
        userDao = context.getBean("awsUserDao", UserDao.class);
        user1 = new User("1","홍길동","1234");
        user2 = new User("2","이순신","4567");
        user3 = new User("3","세종","7896");
    }
    @Test
    void addAndSelect() throws ClassNotFoundException, SQLException {

        // .deleteAll() 오류 검증
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
        //.count test만들기
    void count() throws SQLException, ClassNotFoundException {

        UserDao userDao = context.getBean("AwsUserDao", UserDao.class);
        //.deleteAll() 오류 검증
        userDao.deleteAll();
        assertEquals(0, userDao.getCount());

        userDao.add(user1);
        assertEquals(1, userDao.getCount());
        userDao.add(user2);
        assertEquals(2, userDao.getCount());
        userDao.add(user3);
        assertEquals(3, userDao.getCount());
    }
    @Test
    void findById() {
        assertThrows(EmptyResultDataAccessException.class, ()-> {
            userDao.select("30"); // 데이터가 없을때 ResultSet이 빈 경우 null로 오류가 난다.
        });
    }
}