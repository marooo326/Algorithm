import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        int[] available = new int[n+2];

        for(int student : lost){
           available[student]=1;
        }
        
        Arrays.sort(reserve);
        
        for(int i=0; i<reserve.length; ++i){
            if (available[reserve[i]]==1){
                available[reserve[i]]=0;
                reserve[i] = -1;
                answer+=1;
            }
        }
        
        for(int student : reserve){
            if (student == -1){
                continue;
            } else if (available[student-1]==1){
                available[student-1]=0;
                answer+=1;
                continue;
            } else if (available[student+1]==1){
                available[student+1]=0;
                answer+=1;
                System.out.println(answer);
           }
        }
        
        return answer;
    }
}