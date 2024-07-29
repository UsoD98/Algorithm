import java.util.ArrayList;
class Solution {
    public ArrayList<?> solution(long n) {
        ArrayList<Long> answer = new ArrayList<>();
        
        int i = 10;
        
        while(n>=10){
            
            answer.add(n%i);
            n /= i;
            
        }
        
        answer.add(n);
        
        return answer;
    }
}