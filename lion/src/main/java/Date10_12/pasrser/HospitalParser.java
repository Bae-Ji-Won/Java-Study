package Date10_12.pasrser;

import Date10_12.domain.Hospital;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

// 클래스에서 alt+enter를 눌러 테스트를 할 수 있다.
public class HospitalParser implements Parser<Hospital>{

    static String fileaddress = "C:\\Users\\qowhx\\AppData\\Roaming\\SPB_Data\\git\\Java-Study\\lion\\test.txt";
    static String DBfileaddress = "C:\\DB file\\seoul_hospital_infomation_parsingdata.txt";
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

    public void DBFilewrite(List<Hospital> hospitals){        // 파일 작성
        File file = new File(DBfileaddress);

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            for(Hospital hospital:hospitals){               // 참조변수로 받은 리스트만큼 반복
                writer.write(hospital+"\n");     // 참조변수로 받은 리스트의 값+"\n" 으로 파일에 작성
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
