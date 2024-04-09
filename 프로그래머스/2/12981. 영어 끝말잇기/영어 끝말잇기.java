import java.util.HashMap;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put(words[0],1);
        
        for(int i=1;i<words.length;i++){
            char start = words[i].charAt(0);
            char last = words[i-1].charAt(words[i-1].length()-1);
            
            if(map.containsKey(words[i]) || start!=last){
                answer[0] = i%n + 1;
                answer[1] = i/n + 1;
                break;
            }
            
            map.put(words[i],1);
            
        }

        return answer;
    }
}