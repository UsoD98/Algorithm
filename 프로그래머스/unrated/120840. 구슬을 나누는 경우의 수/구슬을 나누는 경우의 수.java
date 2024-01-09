class Solution {
    public int solution(int balls, int share) {
        double answer = 1;
          
        
        for(int i=1;i<=share;i++){
            answer = answer * (balls-i+1) / i;
        }
        return (int)answer;
    }
}