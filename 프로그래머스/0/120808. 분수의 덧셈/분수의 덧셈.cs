using System;

public class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 분모는 최소공배수
        int lcm = calcLCM(denom1, denom2);
        
        // 분자 계산
        int numer1Adjusted = numer1 * (lcm / denom1);
        int numer2Adjusted = numer2 * (lcm / denom2);
        int resultNumer = numer1Adjusted + numer2Adjusted;
        
        // 기약분수로 만들기
        int gcdResult = calcGCD(resultNumer, lcm);
        int[] answer = new int[] { resultNumer / gcdResult, lcm / gcdResult };
        
        return answer;
    }
    
    public int calcLCM(int a, int b) {
        return (a * b) / calcGCD(a, b);
    }
    
    public int calcGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}