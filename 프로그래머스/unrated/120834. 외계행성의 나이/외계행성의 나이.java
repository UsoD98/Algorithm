class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();

        String[] num = String.valueOf(age).split("");
        for ( String data : num) {
            int a = Integer.parseInt(data);
            char ch = (char)(a+97);
            answer.append(ch);
        }

        return answer.toString();
    }
}