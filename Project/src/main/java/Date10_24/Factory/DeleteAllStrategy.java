package Date10_24.Factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


// Delete 쿼리문 클래스
public class DeleteAllStrategy implements StatementStrategy {

    @Override
    public PreparedStatement makepreparedStatement(Connection connection) throws SQLException {
        return connection.prepareStatement("delete from users");
    }
}


