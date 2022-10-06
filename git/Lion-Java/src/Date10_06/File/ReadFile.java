package Date10_06.File;

import java.io.*;
import java.util.Scanner;

public class ReadFile {

    private String filename;
    private int num;
    private String str = "";


    ReadFile(String filename){      // 파일 이름 가져온다
        this.filename = filename;
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

    String filereader(int num) throws IOException {        // n자리
        this.num = num;
        FileReader br = new FileReader(filename);
        for(int i =0; i<num; i++){
            str += (char)br.read();
        }
        return str;
    }

    void OneLineFileReader() throws IOException{                    //  한 줄 읽기
        BufferedReader br = new BufferedReader(new FileReader(filename),16*1024);       // BufferedReader 사용 (파일이름, 버퍼사이즈 조절)
        String line;
        while( (line = br.readLine()) != null )
            System.out.println(line); //읽어들인 문자열을 출력 합니다.
    }
}

