package Date10_07.Project;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class PopulationMethod {
    static String address = "대용량 데이터 파일 위치";

    static String saveaddress = "파일 생성할 ";
    public static void ReadByChar() throws IOException {             // 1글자씩 읽기
        FileReader fileReader = new FileReader(address);

        String fileContents ="";
        while(fileContents.length()<1_000_000) {
            char c = (char) fileReader.read();         // read()는 반환을 int형으로 하기 때문에 형변환이 필요
            fileContents += c;
            System.out.println(fileContents);
        }
        System.out.println(fileContents);
    }

    public static String ReadByOneLine() throws IOException{         // 1줄 읽기
        BufferedReader reader = new BufferedReader(
                new FileReader(address)
        );
        String str = reader.readLine();
        reader.close();
        return str;
    }

    public static void ReadByLine() throws IOException{         // 1줄씩 전부 읽기
        BufferedReader reader = new BufferedReader(
                new FileReader(address)
        );
        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();
    }

    public static void ReadByLine2() {                      // 1줄씩 전부 읽기 (2)
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(address), StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }


    public static PopulationMove parse(String data){        // 원하는 값 추출을 위한 파싱

        String[] str = data.split(",");
        int FromSido = Integer.parseInt(str[0]);            // 11
        int ToSido = Integer.parseInt(str[6]);              // 41

        return new PopulationMove(FromSido,ToSido);         // 맵핑한 값 반환   "서울,경기도"
    }

    public static String Heatparse(String data){            // heat에 넣기 위한 파싱
        String[] str = data.split(",");
        String FromSido = str[0];            // 11
        String ToSido = str[6];              // 41
        String result = FromSido + ","+ToSido;
        return result;
    }


    public static Map<String,Integer> ReadByLineParse() throws IOException{         // 1줄씩 전부 읽어서 파싱하기
        Map<String,Integer> pml = new HashMap<>();           // PopulationMove arraylist 객체 초기화
        Map<String,Integer> mapcount = new HashMap<>();     // 카운트 저장할 Map

        BufferedReader reader = new BufferedReader(
                new FileReader(address)
        );
        String str;
        while ((str = reader.readLine()) != null) {             // 파일의 마지막 데이터까지 반복
            String pm = String.valueOf(parse(str));             // pm 참조변수에 parse,mapping한(한줄 읽기)값 저장

            // 횟수 구하기
            if(mapcount.get(pm) == null) {         // 처음 들어오는 값이면 1초기화
                mapcount.put(pm,1);
            }
            mapcount.put(pm,mapcount.get(pm)+1);  // 2번째 부터 들어오는 값은 키,키값을 불러와 +1

            pml.put(pm,mapcount.get(pm));         // Map에 저장하여 Key만 중복제거     저장 결과 : "서울,경기도", 1
        }
        reader.close();

        return pml;                                             // 리스트 출력
    }

    public void CreateFile(){            // 파일 생성
        File file = new File(saveaddress);      // 파일 생성 위치및 파일 이름
        try{
            System.out.println("파일 생성");
            file.createNewFile();
        }catch (IOException e){
            System.out.println("파일 생성 못함");
            throw new RuntimeException();
        }
    }

    public void Filewrite(Map<String,Integer>strs){        // 파일 작성
        File file = new File(saveaddress);

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            for(String str:strs.keySet()){               // 참조변수로 받은 리스트만큼 반복
                writer.write(str+","+strs.get(str)+"\n");     // 참조변수로 받은 리스트의 값+"\n" 으로 파일에 작성
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
