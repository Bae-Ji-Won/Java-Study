package Date10_07.Project;

import java.io.IOException;
import java.util.List;

public class PopulationStatistics {
    public static void main(String[] args) throws IOException {
        PopulationMethod method = new PopulationMethod();
     //   method.ReadByChar();                  // 파일 한글자씩 읽기
     //   method.ReadByLine();                  // 파일 한줄씩 읽기
     //   method.ReadByLine2();                 // 파일 한줄씩 읽기(2)
     //   System.out.println(method.parse(method.ReadByOneLine()));     // 파일 한줄만 읽어서 파싱 후 한글로 Mapping
     //   System.out.println(method.ReadByLineParse());

        method.CreateFile();
        method.Filewrite(method.ReadByLineParse());
    }
}
