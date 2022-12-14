package Date10_20.dao.Interface;

import Date10_20.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 중복코드만 따로 빼내서 작성한 코드 (3번째 방식)
public class UserDaoInterface {

    private ConnectionMaker connectionMaker;    // interface의 makeConnection()를 가져옴
    public UserDaoInterface(){                  // 생성자를 통해 AWS DB의 makeConnection()을 오버라이딩하여 사용
        this.connectionMaker = new AWSConnectionMaker();
    }       // 생성자 기본값을 AWS주소로 설정
    public UserDaoInterface(ConnectionMaker connectionMaker){
        this.connectionMaker = connectionMaker;
    }

    public void add(User user) throws ClassNotFoundException {

        try{
   // db 연결(호스트,이름,비밀번호)
            Connection conn = connectionMaker.makeConnection();     // 설정들을 모아둔 메서드 호출
            
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
            Connection conn = connectionMaker.makeConnection();
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
        UserDaoInterface userDao = new UserDaoInterface();
        userDao.add(new User("7","Ruru","1234qwer"));   // user로 값을 받아 DTO에 저장한 후 mysql로 데이터 보냄
        System.out.println(userDao.select("1"));
    }
}