import java.util.HashMap;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < my_string.length(); i++) {
            if(!map.containsKey(my_string.charAt(i))){
                map.put(my_string.charAt(i), i);
                answer += my_string.charAt(i);
            }
        }
        System.out.println(answer);
        return answer;
    }
}