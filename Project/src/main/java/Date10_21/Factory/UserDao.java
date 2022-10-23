package Date10_21.Factory;

import Date10_21.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 중복코드만 따로 빼내서 작성한 코드 (3번째 방식)
public class UserDao {

    private ConnectionMaker connectionMaker;    // interface의 makeConnection()를 가져옴
    public UserDao(){                  // 생성자를 통해 AWS DB의 makeConnection()을 오버라이딩하여 사용
        this.connectionMaker = new AWSConnectionMaker();
    }
    public  UserDao(ConnectionMaker connectionMaker){
        this.connectionMaker = connectionMaker;
    }

    // add,delete등 sql문을 사용하는 메서드들은 쿼리문(insert, delete,select 등)만 다르지 구조는 모두 같다
    // 따라서 이러한 중복되는 구조들을 하나의 메서드로 정의한 후 호출하여 사용함
    public void jdbcContextWithStatementStatementstrategy(StatementStrategy st){
        Connection conn = null;
        PreparedStatement ps = null;

        try {                   // 예외처리
            conn = connectionMaker.makeConnection();
            ps = new DeleteAllStrategy().makepreparedStatement(conn);
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {      // error 발생해도 실행함
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }

            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    public void deleteAll() throws SQLException, ClassNotFoundException {       // DB 모든값 삭제
        jdbcContextWithStatementStatementstrategy(new DeleteAllStrategy());
    }

    public int getCount() throws SQLException, ClassNotFoundException {     // user테이블의 레코드 개수를 구하기
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = connectionMaker.makeConnection();
            ps = conn.prepareStatement("select count(*) from users ");
            rs = ps.executeQuery();
            rs.next();
            return rs.getInt(1);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }

            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    public void add(User user) throws ClassNotFoundException, SQLException {
        AddStrategy addStrategy = new AddStrategy(user);        // User DTO에 저장되어 있는 값 가져옴
        jdbcContextWithStatementStatementstrategy(addStrategy);     // add 쿼리문과 추가할 값 가져와서 대입

        System.out.println("데이터가 insert 됬습니다");
    }

    public User select(String id) throws SQLException, ClassNotFoundException {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;   // 쿼리문을 저장함 insert문과 달리 excuteQuery() 사용
        User user = null;
        try {
            conn = connectionMaker.makeConnection();
            ps = conn.prepareStatement("SELECT id,name,password FROM users WHERE id = ?");
            ps.setString(1, id);     // id는 get(String id)로 받은 id
            rs = ps.executeQuery();
            // rs에는 쿼리 실행 결과가 담겨져 있다. (select * from users where id = 1;)
            rs.next();
            // User 생성자를 통해 쿼리문에 id값을 넣어 찾은 id, name,password 값을 저장한다.
            return new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }

            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                }
            }
        }
    }
}