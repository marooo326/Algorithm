class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        
        int num = (brown-4)/2;
        for (int i=1;i<=num/2;++i){
            if(i*(num-i) == yellow){
                return new int[]{num-i+2,i+2};
            }
        }
        return answer;
    }
}