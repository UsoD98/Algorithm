import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        int start = 0;
        int end = num_list.length-1;
        int i;
        
        for(i=start; i<=end; i++){
            answer.add(num_list[i]);
        }
        
        if(answer.get(end)>answer.get(end-1)){
            answer.add(answer.get(end)-answer.get(end-1));
        }else{
            answer.add(answer.get(end)*2);
        }
        
        return answer;
    }
}