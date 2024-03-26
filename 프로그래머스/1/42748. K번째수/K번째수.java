import java.util.ArrayList;
import java.util.Comparator;
class Solution {
    public ArrayList<Integer> solution(int[] array, int[][] commands) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0;i<commands.length;i++){
            int start = commands[i][0]-1;
            int end = commands[i][1]-1;
            int idx = commands[i][2]-1;
            ArrayList<Integer> new_array = new ArrayList<>();
            for(int j=start;j<=end;j++){
                new_array.add(array[j]);    
            }
            new_array.sort(Comparator.naturalOrder());
            answer.add(new_array.get(idx));
        }
        return answer;
    }
}