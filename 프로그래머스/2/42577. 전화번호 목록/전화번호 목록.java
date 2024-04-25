import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        ArrayList<String> list = new ArrayList<>();
        
        for(String data: phone_book){
            list.add(data);
        }
        Collections.sort(list);
        
        for(int i=0;i<list.size()-1;i++){
            String target = list.get(i);
            String copy = list.get(i+1);   
            if(copy.length()>=target.length()){
                copy = copy.substring(0,target.length());

                if(copy.equals(target)) return false;
            }
        }
        
        return answer;
    }
}