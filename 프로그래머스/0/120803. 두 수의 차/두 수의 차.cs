using System;

public class Solution {
    public int solution(int num1, int num2) {
        int answer = calcSub(num1, num2);
        return answer;
    }
    
    private int calcSub(int num1, int num2) {
        return num1 - num2;
    }
}