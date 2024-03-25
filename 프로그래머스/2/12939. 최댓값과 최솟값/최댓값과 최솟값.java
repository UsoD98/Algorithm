import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String[] s_split = s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for(String data : s_split){
            list.add(Integer.parseInt(data));
        }
        String answer = Collections.min(list) + " " + Collections.max(list);
        return answer;
    }
}