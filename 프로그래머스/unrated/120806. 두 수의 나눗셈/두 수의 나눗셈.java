/*
class Solution {
    public int solution(int num1, int num2) {
        int answer = (1000 * num1 / num2);
        return answer;
    }
}*/

class Solution {
    public int solution(int num1, int num2) {
        double answer = (double) num1 / (double) num2;
        return (int) (answer * 1000);
    }
}