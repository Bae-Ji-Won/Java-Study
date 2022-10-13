package Date10_12.pasrser;

import Date10_12.domain.Hospital;

// 클래스에서 alt+enter를 눌러 테스트를 할 수 있다.
public class HospitalParser implements Parser<Hospital>{

    private String replaceAll(String str){      // " " 제거
        return  str.replaceAll("\"","");
    }

    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        return new Hospital(replaceAll(splitted[0]),replaceAll(splitted[1]));
    }
}
