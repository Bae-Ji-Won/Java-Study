package Date10_06.File;

import java.io.File;

public class FindFile {
    public static void main(String[] args) {
        File file = new File("./");     // ./으로 시작하는 파일
        File[] files = file.listFiles();        // 파일 전체 리스트 저장
        for(File file1 : files){
            System.out.println(file1);
        }
    }
}
