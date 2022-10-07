package Date10_06.File;

import java.io.IOException;

public class ReadFileMain {
    public static void main(String[] args) throws IOException {
        ReadFile rf = new ReadFile
        ("파일 위치");


        System.out.println(rf.onefilereader());
        System.out.println(rf.twofileReader());
        System.out.print(rf.filereader(4));
        System.out.println("");
        rf.OneLineFileReader();
    }
}
