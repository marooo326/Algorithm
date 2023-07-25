import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] count = {0,0,0};
        int[][] patterns = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        for (int j=0; j<3;++j) {
            for (int i=0; i<answers.length;++i) {
                if(answers[i]==patterns[j][i%patterns[j].length]) {
                    count[j]+=1;
                }
            }
        }
        int max = Arrays.stream(count).max().getAsInt();
        List<Integer> answer = new ArrayList<>();
        for (int i=0;i<count.length;++i){
            if (count[i]==max){
                answer.add(i+1);
                max = count[i];
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}