package Date10_06.File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileMain {
    public static void main(String[] args) throws IOException {
        ReadFile rf = new ReadFile
        ("C:\\Users\\qowhx\\OneDrive\\바탕 화면\\hello.txt");

        System.out.println(rf.filereader());

    }
}
