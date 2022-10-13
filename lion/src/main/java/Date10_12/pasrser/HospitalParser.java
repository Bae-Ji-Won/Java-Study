package Date10_12.pasrser;

import Date10_12.domain.Hospital;

// 클래스에서 alt+enter를 눌러 테스트를 할 수 있다.
public class HospitalParser implements Parser<Hospital>{


    @Override
    public Hospital parse(String str) {
        str = str.replaceAll("\"","");  // "" 제거
        String[] splitted = str.split(",");

        return new Hospital(splitted[0],splitted[1],splitted[2],Integer.parseInt(splitted[6]),splitted[10]);
    }
}
