package Date10_06.File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    private String filename;
    private String str = "";
    ReadFile(String filename){
        this.filename = filename;
    }

    String filereader() throws IOException {
        FileReader br = new FileReader(filename);
        for(int i =0; i<2; i++){
            str += (char)br.read();
        }
        return str;
    }
}

