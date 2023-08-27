import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] needs = new int[speeds.length];

        for (int i=0;i<needs.length;++i){
            needs[i] = (99-progresses[i])/speeds[i];
        }

        List<Integer> release = new ArrayList<>();
        int count = 0;
        int lastUpdate = needs[0];
        for (int need : needs) {
            if (lastUpdate>=need) {
                count+=1;
            } else {
                release.add(count);
                lastUpdate=need;
                count = 1;
            }
        }
        release.add(count);
        
        int[] answer = new int[release.size()];
        for (int i=0; i<release.size();++i){
            answer[i]=release.get(i);
        }
        
        return answer;
    }
}