package Date10_07.Project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class PopulationMethod {
    static String address = "파일위치";


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
}
