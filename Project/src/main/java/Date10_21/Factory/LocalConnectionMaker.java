package Date10_21.Factory;


// local DB 연결

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class LocalConnectionMaker implements ConnectionMaker {
    @Override
    public Connection makeConnection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/likelion-db","root","password");

        return conn;
    }
}