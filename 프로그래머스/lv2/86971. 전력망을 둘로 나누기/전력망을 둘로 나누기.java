import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = n;
        
        // 하나씩 끊어보면서 확인
        for(int i=0; i<n-1; ++i){
            // 예외처리를 위해 큐 사용
            Queue<int[]> q = new LinkedList<>();
            // 큐에 삽입
            for(int j=0; j<n-1; ++j){
                // i번째 전선은 제외
                if (i==j) continue;
                q.add(wires[j]);
            }
            
            // 그룹 생성
            Set<Integer> group = new HashSet<>();
            
            // 큐에 기본값 하나 넣어주기
            int[] first = q.remove();
            group.add(first[0]);
            group.add(first[1]);
            
            int fail_cnt = 0;
            while(!q.isEmpty() && fail_cnt <= q.size()){
                int[] wire = q.remove();
                if (group.contains(wire[0]) || group.contains(wire[1])){
                    group.add(wire[0]);
                    group.add(wire[1]);
                    fail_cnt=0;
                } else {
                    fail_cnt+=1;
                    q.add(wire);
                }
            }
            
            // 두 전력망의 차를 구해서 answer(최대 n-1)보다 작으면 answer로 재지정            
            int diff = Math.abs(n-group.size()*2);
            if(diff < answer){
                answer = diff;
            }
        }
        return answer;
    }
}