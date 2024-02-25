class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.toLowerCase();
        String num = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                num += my_string.charAt(i);
            } else if (!num.equals("")) {
                answer += Integer.parseInt(num);
                num = "";
            }
        }
        if (!num.equals("")) {
            answer += Integer.parseInt(num);
        }
        return answer;
    }
}