using System;

public class Solution {
    public int solution(int num1, int num2) {
        int answer = calc(num1, num2);
        return answer;
    }
    
    private int calc(int num1, int num2){
        
        double cal1 = (double)num1 / num2;
        cal1 *= 1000;
        return (int)Math.Truncate(cal1);
    }
}