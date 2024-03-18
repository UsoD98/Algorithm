class Solution {
    public String solution(String my_string, int n) {
        int start = my_string.length() - n;
        int end = my_string.length();
        String answer = "";
        for(int i=start;i<end;i++){
            answer += my_string.charAt(i);
        }
        return answer;
    }
}