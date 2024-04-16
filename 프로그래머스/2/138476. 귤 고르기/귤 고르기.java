import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int answer = 0;
        int length = tangerine.length-k;
        
        for(int i=0;i<tangerine.length;i++){
            if(!map.containsKey(tangerine[i])){
                map.put(tangerine[i],1);
            }else{
                map.put(tangerine[i],map.get(tangerine[i])+1);
            }
        }
        List<Integer> valueList = new ArrayList<>(map.values());
        valueList.sort(Integer::compareTo);
        for (int value : valueList) {
            length -= value;
            if(length<0){
                answer += 1;
            }
        }
        
        
        return answer;
    }
}