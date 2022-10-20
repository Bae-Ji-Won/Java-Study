package Date10_20.Factory;

import Date10_20.dao.Factory.UserDaoFactory;
import Date10_20.dao.Factory.UserDaoInterface;
import Date10_20.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

@ExtendWith(SpringExtension.class)  // spring에서 테스트 하기 위한 설정
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoInterfaceTest {

    @Autowired
    ApplicationContext context; // Spring ApplicationContext를 사용하기 위해서는
    // @ExtendWith 과 @ContextConfiguration를 추가해줘야 한다.

    @Test
    void addAndSelect() throws ClassNotFoundException, SQLException {
        UserDaoInterface userDao = new UserDaoFactory().awsUserDao();
        // awsUserDao()가  UserDaoInterface를 반환하기 때문에 다형성 가능
        String id = "3";
        userDao.add(new User(id,"Spring","123"));

        User user = userDao.select(id);
        Assertions.assertEquals("Spring",user.getName());
    }
}