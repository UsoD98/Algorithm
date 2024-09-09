using System;

public class Solution {
    public int solution(int num1, int num2) {
        int answer = isNumSame(num1, num2);
        return answer;
    }
    
    private int isNumSame(int num1, int num2) {
        if(num1 == num2) {
            return 1;
        } else return -1;
    }
}