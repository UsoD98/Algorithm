import java.util.Arrays;

class Solution {

    public int[] solution(String my_string) {
        String num = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
                num+=my_string.charAt(i);
            }
        }
        int[] answer = new int [num.length()];
        for (int i = 0; i < num.length(); i++) {
            answer[i]=num.charAt(i)-'0';
        }
        Arrays.sort(answer);
        System.out.println(answer);
        return answer;
    }
}