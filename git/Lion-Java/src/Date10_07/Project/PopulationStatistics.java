package Date10_07.Project;

import java.io.IOException;

public class PopulationStatistics {
    public static void main(String[] args) throws IOException {
        PopulationMethod method = new PopulationMethod();
     //   method.ReadByChar();
     //   method.ReadByLine();
     //   method.ReadByLine2();
        System.out.println(method.parse(method.ReadByOneLine()));
    }
}
