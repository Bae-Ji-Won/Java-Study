package Date10_24.Factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// 쿼리문을 DAO 클래스에 작성하지 않고 따로 interface를 통해 각자 별도 클래스 생성함
public interface StatementStrategy {
    PreparedStatement makepreparedStatement(Connection connection) throws SQLException;

}
