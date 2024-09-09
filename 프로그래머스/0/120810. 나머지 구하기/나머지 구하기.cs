using System;

public class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        
        answer = calcRemains(num1, num2);
        
        return answer;
    }
    
    private int calcRemains(int num1, int num2){
        return num1 % num2;
    }
}