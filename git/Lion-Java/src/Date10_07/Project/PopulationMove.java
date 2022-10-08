package Date10_07.Project;

/* 1. 파일을 한줄씩 읽는다
   2. 한줄내용을 split으로 구분한다.
   3. 이사하기 전 도시와 이사하고 난 후 도시의 값만 가져온다
 */

import java.util.HashMap;
import java.util.Map;

public class PopulationMove {
    private int fromSido;
    private int toSido;
    String coments;                 // ReadByLineParse() 메서드에서 파싱한 문자열을 저장할 변수

    int num;
    public PopulationMove(){
        
    }

    public PopulationMove(int fromSido, int toSido) {           // 오버로드
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }


   public String Mapping(int num){         // 숫자입력시 해당하는 지역이름 반환

        Map<Integer,String> map = new HashMap<>();
        map.put(11,"서울");
        map.put(26,"부산");
        map.put(27,"대구");
        map.put(28,"인천");
        map.put(29,"광주");
        map.put(30,"대전");
        map.put(31,"울산");
        map.put(36,"세종");
        map.put(41,"경기도");
        map.put(42,"강원도");
        map.put(43,"충북");
        map.put(44,"충남");
        map.put(45,"전북");
        map.put(46,"전남");
        map.put(47,"경북");
        map.put(48,"경남");
        map.put(50,"제주");

        return map.get(num);
    }

    @Override
    public String toString() {
        return Mapping(fromSido)+","+Mapping(toSido);
    }

}
