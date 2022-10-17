package Date10_12.pasrser;

import Date10_12.domain.Hospital;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

// 클래스에서 alt+enter를 눌러 테스트를 할 수 있다.
public class HospitalParser implements Parser<Hospital>{

    static String fileaddress = "C:\\Users\\qowhx\\AppData\\Roaming\\SPB_Data\\git\\Java-Study\\lion\\test.txt";
    static Map<String,String> env = System.getenv();       // 아래의 값들은 해킹 위험이 있으므로 코드상에 데이터를 넣지말고
    // 왼쪽 위에 메뉴바에서 망치 옆에 프로젝트를 눌러 edit configurations를 누르고
    // environments variables를 눌러 값을 입력해 준다.
    static String dbHost = env.get("DB_HOST");         // DB 호스트 번호(AWS 주소) 가져옴
    static String dbUser = env.get("DB_USER");             // DB 호스트 이름  가져옴
    static String dbPassword = env.get("DB_PASSWORD");     // DB 비밀번호  가져옴

    @Override
    public Hospital parse(String str) {
        str = str.replaceAll("\"","");  // "" 제거
        String[] splitted = str.split(",");

        return new Hospital(splitted[0],splitted[1],splitted[2],Integer.parseInt(splitted[6]),splitted[10]);
    }

    public void CreateFile(){            // 파일 생성
        File file = new File(fileaddress);      // 파일 생성 위치및 파일 이름
        try{
            System.out.println("파일 생성");
            file.createNewFile();
        }catch (IOException e){
            System.out.println("파일 생성 못함");
            throw new RuntimeException();
        }
    }

    public void Filewrite(List<Hospital> hospitals){        // 파일 작성
        File file = new File(fileaddress);

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            for(Hospital hospital:hospitals){               // 참조변수로 받은 리스트만큼 반복
                writer.write(String.valueOf(hospital)+"\n");     // 참조변수로 받은 리스트의 값+"\n" 으로 파일에 작성
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void insert(List<Hospital> hospitals) throws ClassNotFoundException, SQLException {          // 자바 코드를 통해 바로 MYSQL에 데이터 삽입
        Class.forName("com.mysql.cj.jdbc.Driver");  // 만약 DB드라이버가 2개 이상일때 어떤 DB에 데이터를 삽입할 것인지 구분하기 위해 사용함
        // 지금은 mysql 1개만 사용하기 때문에 없어도 됨
        Connection conn = DriverManager.getConnection(dbHost,dbUser,dbPassword);    // db 연결(호스트,이름,비밀번호)
        PreparedStatement ps = conn.prepareStatement("INSERT INTO test(id,address,district,category,emergency_room,name,subdivision) VALUES(?,?,?,?,?,?,?)");


        for(int i =0; i<hospitals.size(); i++) {            // 리스트 사이즈 만큼 반복
            String data = String.valueOf(hospitals.get(i)).replaceAll("\"","");  // 리스트에 저장된 데이터에서 i번 자리의 값을 꺼내 "" 제거
            String[] str =data.split(",");          // 리스트에 저장된 데이터를 , 기준으로 나누어 배열에 저장
            for(int j=0; j<str.length; j++) {           //  ,기준으로 나눈 값을 저장한 배열의 크기만큼 반복 즉, 7번을 반복함
                ps.setString(j+1, str[j]);        // mysql 테이블로 값 insert
            }
            ps.executeUpdate();     // ctrl + enter 즉, mysql에서 번개모양을 눌러 최신화 한다는 느낌
        }


        ps.close();
        conn.close();
        System.out.println("데이터가 insert 됬습니다.");
    }
}
