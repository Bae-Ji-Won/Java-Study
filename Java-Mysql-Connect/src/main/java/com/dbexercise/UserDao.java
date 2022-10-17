package com.dbexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

public class UserDao {
    public void add() throws SQLException, ClassNotFoundException {
        Map<String,String> env = System.getenv();       // 아래의 값들은 해킹 위험이 있으므로 코드상에 데이터를 넣지말고
                                                        // 왼쪽 위에 메뉴바에서 망치 옆에 프로젝트를 눌러 edit configurations를 누르고
                                                        // environments variables를 눌러 값을 입력해 준다.
        String dbHost = env.get("DB_HOST");         // DB 호스트 번호(AWS 주소)
        String dbUser = env.get("DB_USER");             // DB 호스트 이름
        String dbPassword = env.get("DB_PASSWORD");     // DB 비밀번호

        Class.forName("com.mysql.cj.jdbc.Driver");  // 만약 DB드라이버가 2개 이상일때 어떤 DB에 데이터를 삽입할 것인지 구분하기 위해 사용함
                                                             // 지금은 mysql 1개만 사용하기 때문에 없어도 됨 
        Connection conn = DriverManager.getConnection(dbHost,dbUser,dbPassword);    // db 연결(호스트,이름,비밀번호)
        PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id,name,password) VALUES(?,?,?)");
        ps.setString(1,"4");        // mysql 테이블로 값 insert
        ps.setString(2,"hi");
        ps.setString(3,"1234");


        ps.executeUpdate();     // ctrl + enter 즉, mysql에서 번개모양을 눌러 최신화 한다는 느낌
        ps.close();
        conn.close();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        userDao.add();
    }
}
