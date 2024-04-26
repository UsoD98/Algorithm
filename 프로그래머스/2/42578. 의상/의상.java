import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String,Integer> map = new HashMap<>();
        int answer = 1;
        
        for(String[] data : clothes){
            
            if(!map.containsKey(data[1])){
                map.put(data[1],1);
            }else map.put(data[1],map.get(data[1])+1);
            
        }
        
        for(int data:map.values()){
            answer *= (data+1);
        }
        
        return answer-1;
    }
}