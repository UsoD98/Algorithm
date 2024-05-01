class Solution {
    public int solution(int[][] sizes) {
        int replace = 0;
        
        int w = 0;
        int h = 0;
        
        for(int[] size : sizes){
            
            if(size[0]<size[1]){
                replace = size[0];
                size[0] = size[1];
                size[1] = replace;
            }
            if(w<size[0]) w=size[0];
            if(h<size[1]) h=size[1];
            
        }
        
         return w*h;
    }
}