package com.dbexercise.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

// 추상화 상속받음
// 로컬 저장소 연결
public class LocalUserDaoImpl extends UserDaoAbstract{
    @Override
    public Connection makeConnection() throws SQLException {
        Map<String,String> env = System.getenv();       // 아래의 값들은 해킹 위험이 있으므로 코드상에 데이터를 넣지말고
        // 왼쪽 위에 메뉴바에서 망치 옆에 프로젝트를 눌러 edit configurations를 누르고
        // environments variables를 눌러 값을 입력해 준다.

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306"
                ,"root","12345678");
        // Local 저장소는 데이터를 코드상에 입력해도 해커가 털어가기 힘들다.

        return conn;
    }
}
