package Date10_24.Factory;


// 인터페이스로 받은 것을 어떤것을 UserDaoInterface로 넘겨줄것인지 설정
// 즉, 인터페이스로 DB별 연결 설정을 나눠놨는데 여기서 메서드별로 다시 DB별로 나누어
// UserDaoInterface로 해당 DB 연결 설정 값을 보냄

// DB설정 파일을 따로 만들지 않고 Bean 파일에서 한번에 사용할수 있도록 리팩토링

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.util.Map;

@Configuration
public class UserDaoFactory {

    @Bean
    public UserDao awsUserDao(){
        return new UserDao(awsDataSource());
    }

    @Bean
    public UserDao localUserDao(){
        return new UserDao(localDataSource());
    }

    @Bean
    DataSource awsDataSource(){
        Map<String, String> env = System.getenv();
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl(env.get("DB_HOST"));
        dataSource.setUsername(env.get("DB_USER"));
        dataSource.setPassword(env.get("DB_PASSWORD"));
        return dataSource;
    }

    @Bean

    DataSource localDataSource() {
        Map<String, String> env = System.getenv();
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl("localhost");
        dataSource.setUsername("root");
        dataSource.setPassword("12345678");
        return dataSource;
    }


}
