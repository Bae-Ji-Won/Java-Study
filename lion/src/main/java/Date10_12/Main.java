package Date10_12;

import Date10_12.domain.Hospital;
import Date10_12.pasrser.HospitalParser;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        FileController<Hospital> hospitalLineReader = new FileController<>(new HospitalParser());

        List<Hospital> hospitals = hospitalLineReader.readLines();      // 파일에서 값을 1줄씩 전체 읽어 list에 저장
        
        HospitalParser hospitalParser = new HospitalParser();
        hospitalParser.CreateFile();                // 파일 생성

        hospitalParser.Filewrite(hospitals);
        hospitalParser.DBFilewrite(hospitals);
    }
}
