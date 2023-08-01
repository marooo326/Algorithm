class Solution {
    int[] nums;
    int len;
    int t;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        nums = numbers;
        len = numbers.length;
        t = target;
        return dfs(0,0);
    }
    
    public int dfs(int i, int sum) {
        if(i==len){
            if(sum == t){
                return 1;
            }else{
                return 0;
            }
        }else{
            return dfs(i+1,sum+nums[i]) + dfs(i+1,sum-nums[i]);
        }
    }
}