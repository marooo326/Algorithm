import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int sc : scoville){
            pq.add(sc);
        }
        
        while(!pq.isEmpty()){
            Integer min = pq.peek();
            pq.remove();
            if(min >= K){
                break;
            }else if(pq.isEmpty()){
                return -1;
            }
            Integer min2 = pq.peek();
            pq.add(min+min2*2);
            pq.remove();
            answer+=1;
        }
        
        return answer;
    }
}