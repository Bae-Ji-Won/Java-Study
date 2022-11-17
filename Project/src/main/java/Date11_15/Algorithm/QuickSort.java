package Date11_15.Algorithm;

import java.util.ArrayList;
import java.util.List;

// 재귀함수를 통한 퀵 정렬 - List로 풀기
public class QuickSort {

    public List<Integer> merge(List<Integer> left,List<Integer> mid,List<Integer> right){
        List<Integer> answer = new ArrayList<>();
        answer.addAll(left);
        answer.addAll(mid);
        answer.addAll(right);

        return answer;
    }

    public List<Integer> sort(List<Integer> arr){

        // 재귀 탈출 조건
        if(arr.size()<=1) return arr;       // mid보다 값이 모두 작거나 커서 한쪽으로 쏠려 한쪽에는 아예 들어가지 않는 경우도 생기고
                                            // 1개의 값만 들어가는 경우도 생긴다. 1개만 들어가면 더이상 비교를 할 수 없기에 1이하로 하여 재귀를 빠져나오도록 한다.

        // 1. 기준값 뽑는 로직 구현
        int pivot = arr.get(arr.size()/2);  // index = 4 , arr[4] = 5

        // 2. 기준값 기준으로 왼쪽 오른쪽으로 나누어 담는 로직 구현
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();

        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)<pivot){
                left.add(arr.get(i));
            }else if(arr.get(i)>pivot)
                right.add(arr.get(i));
            else
                mid.add(arr.get(i));
        }

        // list를 합치는 연산
        return merge(sort(left),mid,sort(right));
    }

    public static void main(String[] args) {
        int[] arr = {20,18,5,19,5,25,40,50};        // 8
        List<Integer> al = new ArrayList<>();
        for(int i =0; i<arr.length; i++){
            al.add(arr[i]);
        }

        QuickSort q = new QuickSort();
        System.out.println(q.sort(al));

    }
}
