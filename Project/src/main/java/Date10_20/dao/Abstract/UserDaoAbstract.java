package Date10_20.dao.Abstract;

import Date10_20.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 추상화를 통해 여러 DB의 값들을 따로 호출하여 사용하는 방법   (2번째 방식)


public abstract class UserDaoAbstract {

    public abstract Connection makeConnection() throws SQLException;
    // DB를 여러개 동시에 사용하는 경우 각 DB에 연결시켜야 하므로 추상화 클래스를 상속받아
    // 원하는 DB로 연결시키는 방식에 사용

    public void add(User user) throws ClassNotFoundException {

        try{
            // db 연결(호스트,이름,비밀번호)
            Connection conn = makeConnection();     // 설정들을 모아둔 메서드 호출

            PreparedStatement ps =  conn.prepareStatement("INSERT INTO users(id,name,password) VALUES(?,?,?)");
            ps.setString(1,user.getId());        // mysql 테이블로 값 insert
            ps.setString(2,user.getName());
            ps.setString(3,user.getPassword());

            ps.executeUpdate();     // ctrl + enter 즉, mysql에서 번개모양을 눌러 최신화 한다는 느낌
            ps.close();
            conn.close();
            System.out.println("데이터가 insert 됬습니다.");

        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    public User select(String id) throws SQLException, ClassNotFoundException {

        try {
            Connection conn = makeConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT id,name,password FROM users WHERE id = ?");
            ps.setString(1, id);     // id는 get(String id)로 받은 id
            ResultSet rs = ps.executeQuery();   // 쿼리문을 저장함 insert문과 달리 excuteQuery() 사용
            // rs에는 쿼리 실행 결과가 담겨져 있다. (select * from users where id = 1;)
            rs.next();

            // User 생성자를 통해 쿼리문에 id값을 넣어 찾은 id, name,password 값을 저장한다.
            User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
            rs.close();
            ps.close();
            conn.close();
            return user;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }


   public static void main(String[] args) throws ClassNotFoundException, SQLException {
        AWSUserDaoImpl userDao = new AWSUserDaoImpl();
        userDao.add(new User("7","Ruru","1234qwer"));   // user로 값을 받아 DTO에 저장한 후 mysql로 데이터 보냄
        System.out.println(userDao.select("1"));
    }
 
}
