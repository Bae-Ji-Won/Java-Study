package Date10_21.Factory;

import Date10_21.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddStrategy implements StatementStrategy{

    private User user;

    public AddStrategy(User user){
        this.user =user;
    }

    @Override
    public PreparedStatement makepreparedStatement(Connection connection) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO users(id,name,password) VALUES(?,?,?)");
        ps.setString(1,user.getId());        // mysql 테이블로 값 insert
        ps.setString(2,user.getName());
        ps.setString(3,user.getPassword());

        return ps;
    }
}
