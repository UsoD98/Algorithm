class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int n=i;n<=j;n++){
            String str_n = Integer.toString(n);
            for(int m=0;m<str_n.length();m++){
                if(str_n.charAt(m)==(char)(k+'0')){
                    answer += 1;
                }
            }
        }
        return answer;
    }
}