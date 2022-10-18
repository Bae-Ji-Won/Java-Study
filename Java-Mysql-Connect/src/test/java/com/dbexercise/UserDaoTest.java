package com.dbexercise;

import com.dbexercise.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    void addAndSelect() throws ClassNotFoundException, SQLException {
        UserDao userDao = new UserDao();
        String id = "9";
        User user = new User(id,"test","1234");    // user 값을 DTO에 저장함
        userDao.add(user);

        User selectedUser = userDao.select(id);        // DTO에 저장되어 있는 데이터를 가져와 비교함
        Assertions.assertEquals("test",selectedUser.getName());
    }
}