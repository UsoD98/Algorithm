class Solution {
    public boolean solution(int x) {
        
        int sum = 0;
        
        String numStr = String.valueOf(x);
        
        for(int num : numStr.toCharArray()){
            sum += num-'0';
        }
        
        if(x % sum == 0) return true;
        else return false;
        
    }
}