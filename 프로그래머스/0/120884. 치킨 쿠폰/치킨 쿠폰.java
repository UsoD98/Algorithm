class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int remain = 0;
        if(chicken<10){
            return 0;
        }else
        {
            answer = chicken / 10;
            remain = chicken % 10;
            return answer + solution(answer + remain);
        }
    }
}