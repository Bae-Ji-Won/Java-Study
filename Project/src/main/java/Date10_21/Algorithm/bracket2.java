package Date10_21.Algorithm;

// split, join 사용하여 풀기

public class bracket2{
    public boolean result2(String s){
        while(s.indexOf("()")>= 0){
            String[] splitted = s.split("\\(\\)");
            s = String.join("",splitted);       // join 배열을 문자열로 변경
        }
        return s.length()==0;
    }
}
