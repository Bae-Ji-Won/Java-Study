package Date10_11.Algorithm;

public class Solution {
    public int solution(int n){
        int result = 0;

        while(n>0){
            result += n%10;

            result /= 10;
        }
        return result;
    }
}
