class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] rsp1 = rsp.split("");
        int num;
        for (String s : rsp1) {
            if(s.equals("0")){
                answer += 5;
            } else if(s.equals("2")){
                answer += 0;
            } else answer += 2;
        }
        return answer;
    }
}