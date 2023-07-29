import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i,j,k;
        int index = 0;
        for (int[] command : commands){
            i = command[0];
            j = command[1];
            k = command[2];
            int[] temp = Arrays.copyOfRange(array,i-1,j);
            System.out.println(temp[0]);
            Arrays.sort(temp);
            answer[index] = temp[k-1];
            index+=1;
        }
        return answer;
    }
}