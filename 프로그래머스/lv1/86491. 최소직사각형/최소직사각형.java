class Solution {
    public int solution(int[][] sizes) {
        int x=0;
        int y=0;
        for (int[] size: sizes){
            int width;
            int heigth;
            if (size[0]>=size[1]){
                width = size[0];
                heigth = size[1];
            }else{
                width = size[1];
                heigth = size[0];
            }
            if(width>=x){
                x = width;
            }
            if(heigth>=y){
                y = heigth;
            }
            
        }
        return x*y;
    }
}