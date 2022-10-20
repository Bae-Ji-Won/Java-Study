package Date10_20;

import Date10_20.dao.Abstract.AWSUserDaoImpl;
import Date10_20.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class UserDaoTest {

    @Test
    void addAndSelect() throws ClassNotFoundException, SQLException {
        AWSUserDaoImpl userDao = new AWSUserDaoImpl();
        String id = "10";
        User user = new User(id,"test","1234");    // user 값을 DTO에 저장함
        userDao.add(user);

        User selectedUser = userDao.select(id);        // DTO에 저장되어 있는 데이터를 가져와 비교함
        Assertions.assertEquals("test",selectedUser.getName());
    }
}