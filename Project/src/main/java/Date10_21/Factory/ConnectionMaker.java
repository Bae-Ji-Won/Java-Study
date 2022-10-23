package Date10_21.Factory;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {      // makeConnection을 각 DB에 맞게 사용할 수 있도록 불러오기 위한 interface
    Connection makeConnection() throws SQLException, ClassNotFoundException;
}
