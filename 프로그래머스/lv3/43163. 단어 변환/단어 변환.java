class Solution {
    public boolean convertible(String w1, String w2) {
        int count = 0;
        String[] word1 = w1.split("");
        String[] word2 = w2.split("");
        
        for (int i=0; i<word1.length; ++i) {
            if (!word1[i].equals(word2[i])) {
                count += 1;
            }
        }
        
        if (count > 1) {
            return false;
        } else {
            return true;
        }
    }
    
    public int dfs(String[] words, int[] check, String word ,String target) {        
        if (word.equals(target)){
            int count = 0;
            for (int ck : check) {
                if (ck==1) count+=1;
            }
            System.out.println("count : "+count);
            return count;
        }
        
        int minCount = words.length+1;
        boolean isExist = false;
        
        for (int i=0; i<words.length; ++i) {
            if (check[i] != 1 && convertible(word, words[i])){
                check[i] = 1;
                isExist = true;
                int result = dfs(words, check, words[i], target);
                System.out.println("minCount : "+ minCount);
                
                if (result < minCount) {
                    minCount = result;
                }
                check[i] = 0;
            }
        }
        return isExist?minCount:words.length+1;
    }
    
    public int solution(String begin, String target, String[] words) {
        int[] check = new int[words.length];
        int result = dfs(words, check, begin, target);
        if (result <= words.length) {
            return result;
        }
        return 0;
    }
}