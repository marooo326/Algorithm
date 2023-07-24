import java.util.*;

class Solution {
    static class Node{
        int request;
        int cost;
        
        Node(int request, int cost){
            this.request = request;
            this.cost = cost;
        }
        
        Node(Node p){
            this.request = p.request;
            this.cost = p.cost;
        }

        
        public int compareByRequest(Node p){
            if(this.request <= p.request){
                return -1;
            }
            return 1;
        }
        
        public int compareByCost(Node p){
            if(this.cost < p.cost){
                return -1;
            }
            return 1;
        }
        
    }
    
    public int solution(int[][] jobs) {
        int answer = 0;
        int current = 0;

        PriorityQueue<Node> requestQ = new PriorityQueue<>(Node::compareByRequest);
        PriorityQueue<Node> costQ = new PriorityQueue<>(Node::compareByCost);
        
        for (int[] job : jobs) {
            requestQ.add(new Node(job[0],job[1]));
        }
        
        while(true){
            if (!requestQ.isEmpty()){
                // 요청 시점이 current 보다 앞이면 다 넣음
                while(!requestQ.isEmpty() && requestQ.peek().request<=current){ // NullPointerException 주의
                    costQ.add(new Node(requestQ.remove()));
                }
                
                // 중간에 비어버린 경우 공백 제거
                if(costQ.isEmpty()){
                    current = requestQ.peek().request;
                    continue;
                }
             }else{
                // costQ까지 비어있으면 break;
                if(costQ.isEmpty()){
                    break;
                }
            }
            
            // 하나 실행시키고 current 최신화
            Node ex = new Node(costQ.remove());
            if (current - ex.request >= 0){
                answer += current - ex.request + ex.cost;
                current += ex.cost;
            }else{
                // 중간에 비어버린 경우
                answer += ex.cost;
                current += ex.request + ex.cost ;
            }
        }
        
        return answer/jobs.length;
    }
}