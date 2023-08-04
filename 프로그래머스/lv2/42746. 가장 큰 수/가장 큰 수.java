import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        Integer[] IntegerNums = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        String[] sortedNums = new String[numbers.length];
        Arrays.sort(IntegerNums, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                String s1 = Integer.toString(o1);
                String s2 = Integer.toString(o2);
                if (Long.parseLong(s1+s2) > Long.parseLong(s2+s1)){
                    return -1;
                } else if(Long.parseLong(s1+s2) < Long.parseLong(s2+s1)){
                    return 1;
                }
                return 0;
            }
        });
        
        for (int i=0; i<numbers.length; ++i){
            sortedNums[i] = Integer.toString(IntegerNums[i]);
        }

        if (sortedNums[0].equals("0")){
            return "0";
        }
        return String.join("",sortedNums);
    }
}