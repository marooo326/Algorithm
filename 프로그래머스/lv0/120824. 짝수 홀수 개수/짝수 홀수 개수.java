class Solution {
    public int[] solution(int[] num_list) {
        int[] arr = {0,0};
        for (int n : num_list){
            arr[n%2]+=1;
        }
        return arr;
    }
}