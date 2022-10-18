package com.dbexercise;

import com.dbexercise.dao.UserDaoConnectionMaker;
import com.dbexercise.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;


// 3번째 방식 테스트
class UserDaoConnectionMakerTest {
    @Test
    void addAndSelect() throws ClassNotFoundException, SQLException {
        UserDaoConnectionMaker userDao = new UserDaoConnectionMaker();
        String id = "11";
        User user = new User(id,"test","1234");    // user 값을 DTO에 저장함
        userDao.add(user);

        User selectedUser = userDao.select(id);        // DTO에 저장되어 있는 데이터를 가져와 비교함
        Assertions.assertEquals("test",selectedUser.getName());
    }
}