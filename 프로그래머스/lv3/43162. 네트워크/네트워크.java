import java.util.*;

class Solution {
    public int dfs(int[] status, int[][] computers, int start, int current){
        if (status[current] == -1){
            return 0;
        } else {
            status[current] = -1;
        }
        
        for (int i=0; i<status.length; ++i) {
                if (i != start && i != current && computers[current][i] == 1) {
                    dfs(status, computers, start, i);
                }
        }
        return 0;
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int[] status = new int[n];
        for (int i=0; i<n; ++i){
            if (status[i] == 0){
                dfs(status, computers, i, i);
                answer += 1;
            }
        }
        return answer;
    }
    
}