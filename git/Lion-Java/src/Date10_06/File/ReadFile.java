package Date10_06.File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    private String filename;

    ReadFile(String filename){
        this.filename = filename;
    }

    char filereader() throws IOException {
        FileReader br = new FileReader(filename);

        return (char)br.read();
    }
}
