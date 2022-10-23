package Date10_21.Factory;


// 인터페이스로 받은 것을 어떤것을 UserDaoInterface로 넘겨줄것인지 설정
// 즉, 인터페이스로 DB별 연결 설정을 나눠놨는데 여기서 메서드별로 다시 DB별로 나누어
// UserDaoInterface로 해당 DB 연결 설정 값을 보냄
// (4번째 방식)
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDaoFactory {

    @Bean
    public UserDao awsUserDao(){
        AWSConnectionMaker awsConnectionMaker = new AWSConnectionMaker();
        UserDao userDao = new UserDao(awsConnectionMaker);
        return userDao;
    }

    @Bean
    public UserDao localUserDao(){
        UserDao userDao = new UserDao(new LocalConnectionMaker());
        return userDao;
    }
}
