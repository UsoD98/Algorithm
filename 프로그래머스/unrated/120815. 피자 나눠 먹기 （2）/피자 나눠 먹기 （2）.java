class Solution {
    public int solution(int n) {
        int answer = 0;
        int first = n;
        for (int i = 1; i <= 150; i++) {
            if(n%6==0){
                answer = n/6;
                break;
            }
            else n += first;
        }
        return answer;
    }
}