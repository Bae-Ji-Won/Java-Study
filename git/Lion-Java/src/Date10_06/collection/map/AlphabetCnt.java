package Date10_06.collection.map;

import java.util.HashMap;
import java.util.Map;

public class AlphabetCnt {

    public static void main(String[] args) {
        String s1 = "abbccceefgh";
        String upper = s1.toUpperCase();    // 모든 문자 대문자로 변환

        Map<Character,Integer> map = new HashMap<>();

        for(char c = 'A'; c<='Z'; c++){     // A~Z까지 비교
            int count = 0;                  
            for(int i=0; i<upper.length(); i++){
                char s = upper.charAt(i);   // 입력한 문자열 문자로 변환
                if(isAlphabet(s)){          // 입력받은 문자가 알파벳이라면
                    if(c == s){             // 현재 바깥 for문에서 A문자를 돌리는 중일때 
                        count++;            // A문자와 입력받은 문자가 같을때 카운트
                    }
                }
            }
            map.put(c,count);
        }
        System.out.println(map);
    }

    public static boolean isAlphabet(char c){
        return ('A'<= c && c<='Z');
    }
}
