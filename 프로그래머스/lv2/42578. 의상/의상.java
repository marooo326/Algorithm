import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String,Integer> clothes_cnt = new HashMap<>();
        for (String[] cloth : clothes){
            Integer cnt = clothes_cnt.getOrDefault(cloth[1],0);
            clothes_cnt.put(cloth[1],cnt+1);
        }
        
        Iterator<String> keys = clothes_cnt.keySet().iterator();
        while(keys.hasNext()){
            String key = keys.next();
            answer *= clothes_cnt.get(key)+1;
        }
        
        return answer-1;
    }
}