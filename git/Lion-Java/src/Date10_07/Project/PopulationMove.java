package Date10_07.Project;

/* 1. 파일을 한줄씩 읽는다
   2. 한줄내용을 split으로 구분한다.
   3. 이사하기 전 도시와 이사하고 난 후 도시의 값만 가져온다
 */

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

    @Override
    public String toString() {
      return fromSido+"에서 "+toSido+"로 이사갔습니다.";
    }
}
