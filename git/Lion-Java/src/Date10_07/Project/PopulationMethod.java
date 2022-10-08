package Date10_07.Project;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PopulationMethod {
    static String address = "C:\\Users\\qowhx\\OneDrive\\바탕 화면\\인구\\2021_인구관련연간자료_20221006_47106.csv";

    static String saveaddress = "C:\\Users\\qowhx\\AppData\\Roaming\\SPB_Data\\git\\Java-Study\\file.txt";
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


    public static PopulationMove parse(String data) throws IOException {        // 원하는 값 추출

        String[] str = data.split(",");
        int FromSido = Integer.parseInt(str[0]);
        int ToSido = Integer.parseInt(str[6]);

        return new PopulationMove(FromSido,ToSido);
    }

    public static List<PopulationMove> ReadByLineParse() throws IOException{         // 1줄씩 전부 읽어서 파싱하기
        List<PopulationMove> pml = new ArrayList<>();           // PopulationMove arraylist 객체 초기화
        BufferedReader reader = new BufferedReader(
                new FileReader(address)
        );
        String str;
        while ((str = reader.readLine()) != null) {             // 파일의 마지막 데이터까지 반복
            PopulationMove pm = parse(str);                     // pm 참조변수에 parse(한줄 읽기)값 저장
            pml.add(pm);                                        // 리스트에 pm 값 저장
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

    public void Filewrite(List<PopulationMove>strs){        // 파일 작성
        File file = new File(saveaddress);      

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for(PopulationMove str:strs){               // 매개변수로 받은 리스트만큼 반복
                writer.write(String.valueOf(str)+"\n");     // 매개변수로 받은 리스트의 값+"\n" 으로 파일에 작성
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
