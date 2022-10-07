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

    public String Mapping(int num){

        Map<Integer,String> map = new HashMap<>();
        map.put(11,"서울");
        map.put(21,"부산");
        map.put(22,"대구");
        map.put(23,"인천");
        map.put(24,"광주");
        map.put(25,"대전");
        map.put(26,"울산");
        map.put(29,"세종");
        map.put(31,"경기도");
        map.put(32,"강원도");
        map.put(33,"충북");
        map.put(34,"충남");
        map.put(35,"전북");
        map.put(36,"전남");
        map.put(37,"경북");
        map.put(38,"경남");
        map.put(39,"제주");

        return map.get(num);
    }
    @Override
    public String toString() {
      return Mapping(fromSido)+"에서 "+Mapping(toSido)+"로 이사갔습니다.";
    }
}
