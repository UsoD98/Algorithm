using System;

public class Solution {
    public int solution(int age) {
        int answer = calcBirthYear(age);
        return answer;
    }
    
    private int calcBirthYear(int age) {
        
        return 2022 - age + 1;
        
    }
}