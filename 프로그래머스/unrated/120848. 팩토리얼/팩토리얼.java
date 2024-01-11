class Solution {
    public int solution(int n) {
        int answer = 1;
        int num=1;
        while(true){
            if(num>n){
                break;
            }
            num *= answer;
            System.out.println(num + " " + answer);
            answer += 1;
        }
        return answer-2;
    }
}