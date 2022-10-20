package Date10_20.Factory;

import Date10_20.dao.Factory.UserDaoFactory;
import Date10_20.dao.Factory.UserDaoInterface;
import Date10_20.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class UserDaoInterfaceTest {

    @Test
    void addAndSelect() throws ClassNotFoundException, SQLException {
        UserDaoInterface userDao = new UserDaoFactory().awsUserDao();
        // awsUserDao()가  UserDaoInterface를 반환하기 때문에 다형성 가능
        String id = "2";
        userDao.add(new User(id,"Nunu","123"));

        User user = userDao.select(id);
        Assertions.assertEquals("Nunu",user.getName());
    }
}