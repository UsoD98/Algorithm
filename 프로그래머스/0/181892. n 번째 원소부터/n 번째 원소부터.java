import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] num_list, int n) {
        int start = n - 1;
        int end = num_list.length;
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=start;i<end;i++){
            answer.add(num_list[i]);
        }
        
        return answer;
    }
}