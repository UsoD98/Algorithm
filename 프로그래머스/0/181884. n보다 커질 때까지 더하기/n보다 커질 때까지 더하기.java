class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int start=0;
        while(answer<=n){
            answer += numbers[start];
            start++;
        }
        return answer;
    }
}