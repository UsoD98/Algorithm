class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        int len = numbers.length;
        int num = 1;
        while(true){
            if(num==k) break;
            num += 1;
            answer += 2;
            if(answer>len){
                answer = answer % len;
            }
        }
        return answer;
    }
}