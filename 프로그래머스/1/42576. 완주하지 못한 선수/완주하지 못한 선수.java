import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> p = new HashMap<>();
        
        //해시맵 p에 참가자 넣기
        for(String data : participant){
            if(!p.containsKey(data)){
                p.put(data, 1);
            }else{
                p.put(data, p.get(data)+1);
            }
        }
        
        for(String data : completion){
            if(p.containsKey(data)){
                p.put(data, p.get(data)-1);
                if(p.get(data) == 0){
                    p.remove(data);
                }
            }
        }
        
        for (String key: p.keySet()){
            answer = key;
        }
        
        return answer;
    }
}