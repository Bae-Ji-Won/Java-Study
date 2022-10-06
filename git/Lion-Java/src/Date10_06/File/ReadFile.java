package Date10_06.File;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    private String filename;
    private int num;
    private String str = "";
    ReadFile(String filename,int num){
        this.filename = filename;
        this.num = num;
    }


    String filereader() throws IOException {
        FileReader br = new FileReader(filename);
        for(int i =0; i<num; i++){
            str += (char)br.read();
        }
        return str;
    }
}

