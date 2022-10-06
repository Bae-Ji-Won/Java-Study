package Date10_06.File;

import java.io.*;
import java.util.Scanner;

public class ReadFile {

    private String filename;
    private int num;
    private String str = "";
    ReadFile(String filename,int num){
        this.filename = filename;
        this.num = num;
    }


    char onefilereader() throws IOException{            // 1자리
        FileReader br = new FileReader(filename);
        return (char)br.read();
    }

    String twofileReader() throws IOException{          // 2자리
        String st = "";
        FileReader br = new FileReader(filename);
        for(int i=0; i<2; i++){
            st += (char)br.read();
        }
        return st;
    }

    String filereader() throws IOException {        // n자리
        FileReader br = new FileReader(filename);
        for(int i =0; i<num; i++){
            str += (char)br.read();
        }
        return str;
    }
}

