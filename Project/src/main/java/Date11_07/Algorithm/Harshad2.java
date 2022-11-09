package Date11_07.Algorithm;

import java.util.*;

/*  PriorityQueue() 사용해서 푸는 법

    프로그래머스 나누어 떨어진느 숫자 배열
    1. 배열을 통해 숫자 값들을 입력받음
    2. 나누고 싶은 값을 설정함
    3. 배열에 있는 값들을 나누고 싶은 값을 통해 나눔
    4. 이때 나머지가 없이 딱 나누어지는 값을 배열에 넣어 리턴함
    5. 만약 나머지가 없이 딱 나누어 떨어지는 값이 없을경우 -1 리턴
 */
public class Harshad2 {

    // 기본 풀이 (리스트로 값 받은 후 배열에 저장하여 반환)
    public int[] solution(int[] arr,int divisor){

        List<Integer> templist = new ArrayList<>();

        for(int i=0; i<arr.length; i++){        // arr배열에 있는 값들을 모두 divisor로 나눈다
            if(arr[i] % divisor ==0){           // 이때 나머지가 없이 딱 나누어 떨어진다면
                templist.add(arr[i]);           // 리스트에 저장함
                // (이때 배열말고 리스트를 사용한 이유는 중간에 나누어 떨어지는 값이 아닐경우 빈공간이 생기기 때문에 이를 방지하기위해 list 사용)
            }
        }

        int[] result = new int[templist.size()];     // 결과값을 담을 배열 선언

        for(int i=0; i<templist.size(); i++){
            result[i] = templist.get(i);        // 배열에 리스트 값 넣어줌
        }

        if(result.length == 0){        // 만약 나누어 떨어지는 값이 없다면
            return new int[]{-1};
        }

        Arrays.sort(result);        // 배열 오름차순 정렬

        return result;
    }

    // PriorityQueue() 사용해서 푸는 법
    // (Priority Queue는 기본큐의 기능인 FIFO를 가지면서 우선순위를 먼저 결정하고 우선순위가 높은 데이터가 먼저 나가는 자료구조이다)
    public int[] solution2(int[] arr, int divisor){
        Queue<Integer> list = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) list.add(arr[i]);
        }

        if(list.size() == 0) return new int[]{-1};

        // list를 Array로 바꾸기
        int[] answer = new int[list.size()];        // 배열의 크기를 list크기만큼 설정 
        int idx = 0;
        while(!list.isEmpty()){                     // 리스트가 비어있지 않을경우
            answer[idx++] = list.poll();            // 배열에 리스트를 넣는다.
        }
        return answer;
    }

    public static void main(String[] args) {
        Harshad2 hs = new Harshad2();
        int[] arr ={5,9,7,10};
        int[] arr2 ={2,36,1,3};
        int[] arr3 = {3,2,6};
        System.out.println(Arrays.toString(hs.solution2(arr,5)));
        System.out.println(Arrays.toString(hs.solution2(arr2,1)));
        System.out.println(Arrays.toString(hs.solution2(arr3,10)));
    }
}
