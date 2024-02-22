import java.util.HashMap;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char i = 'a'; i <= 'z'; i++) {
            map1.put(i, 0);
            map2.put(i, 0);
        }
        for (int i = 0; i < before.length(); i++) {
            if (map1.containsKey(before.charAt(i))) {
                map1.put(before.charAt(i), map1.get(before.charAt(i)) + 1);
            }
            if (map2.containsKey(after.charAt(i))) {
                map2.put(after.charAt(i), map2.get(after.charAt(i)) + 1);
            }
        }
        if(map1.equals(map2)){
            answer=1;
        }
        return answer;
    }
}
