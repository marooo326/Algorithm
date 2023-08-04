import java.util.*;

class Solution {
    static int answer = 8;
    
    public void dfs(int[][] dungeons, List<Integer> left, int k){
        answer = left.size() < answer ? left.size() : answer;

        if (k<=0 || left.isEmpty()) {
            return ;
        }
        
        for (int i=0; i<left.size(); ++i) {
            int next = left.get(i);
            if (k >= dungeons[next][0]) {
                List<Integer> update = new ArrayList<>(List.copyOf(left));
                update.remove(i);
                dfs(dungeons, update, k-dungeons[next][1]);
            }
        }
        return ;
    }
    
    public int solution(int k, int[][] dungeons) {
        
        List<Integer> left = new ArrayList<>();
        for (int i=0; i<dungeons.length; ++i) {
            left.add(i);
        }
        
        dfs(dungeons,left,k);
        return dungeons.length - answer;
    }
}