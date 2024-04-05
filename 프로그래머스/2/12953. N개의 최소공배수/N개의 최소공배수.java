import java.util.ArrayList;

class Solution {
    public long solution(int[] arr) {
        long answer = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        
        return answer;
    }
    
    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
        
    private long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}