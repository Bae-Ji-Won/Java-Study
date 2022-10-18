package com.dbexercise.dao;


// 2번째 방식을 클래스로 따로 빼내어 사용하는 방식      (3번째 방법)

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class AWSConnectionMaker {
    public Connection makeConnection() throws SQLException {
        Map<String,String> env = System.getenv();       // 아래의 값들은 해킹 위험이 있으므로 코드상에 데이터를 넣지말고
        // 왼쪽 위에 메뉴바에서 망치 옆에 프로젝트를 눌러 edit configurations를 누르고
        // environments variables를 눌러 값을 입력해 준다.
        String dbHost = env.get("DB_HOST");         // DB 호스트 번호(AWS 주소) 가져옴
        String dbUser = env.get("DB_USER");             // DB 호스트 이름  가져옴
        String dbPassword = env.get("DB_PASSWORD");     // DB 비밀번호  가져옴

        Connection conn = DriverManager.getConnection(dbHost,dbUser,dbPassword);

        return conn;
    }
}
