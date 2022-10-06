package Date10_06.File;

import java.io.IOException;

public class ReadFileMain {
    public static void main(String[] args) throws IOException {
        ReadFile rf = new ReadFile
        ("C:\\Users\\qowhx\\OneDrive\\바탕 화면\\hello.txt");


        System.out.println(rf.onefilereader());
        System.out.println(rf.twofileReader());
        System.out.print(rf.filereader(4));
        System.out.println("");
        rf.OneLineFileReader();
    }
}
