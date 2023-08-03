import java.util.*;

class Solution {
    class Pair {
        private int x;
        private int y;
        private int cost;

        public Pair (int x, int y, int cost){
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
        
        public int getX() {
            return this.x;
        }
        
        public int getY() {
            return this.y;
        }
        
        public int getCost() {
            return this.cost;
        }
    }
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        Queue<Pair> q = new LinkedList<>();
        maps[0][0] = 0; 
        q.add(new Pair(0,0,1));
        
        while(!q.isEmpty()) {
            Pair current = q.remove();
            int x = current.getX();
            int y = current.getY();
            int cost = current.getCost();
            
            if(x==n-1 && y==m-1){
                answer = cost;
                break;
            }
            if (x+1 < n && maps[x+1][y] == 1) {
                q.add(new Pair(x+1,y,cost+1));
                maps[x+1][y] = 0; 
            }
            if (y+1 < m && maps[x][y+1] == 1) {
                q.add(new Pair(x,y+1,cost+1));
                maps[x][y+1] = 0; 
            }
            if (x-1 >= 0 && maps[x-1][y] == 1) {
                q.add(new Pair(x-1,y, cost+1));
                maps[x-1][y] = 0; 
            }
            if (y-1 >= 0 && maps[x][y-1] == 1) {
                q.add(new Pair(x,y-1,cost+1));
                maps[x][y-1] = 0; 
            }
        }
        return answer>0?answer:-1;
    }
}