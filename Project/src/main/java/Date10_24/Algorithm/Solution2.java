package Date10_24.Algorithm;

import java.util.PriorityQueue;

// 우선순위 큐 사용
public class Solution2 {
    public int[] solution2(int[] arr, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                pq.add(arr[j]);         // 우선순위 큐에 from, to까지 넣기
            }
            for (int j = 0; j < commands[i][2]; j++) {
                answer[i] = pq.poll(); //stack의 pop과
            }
        }
        return answer;
    }
}
