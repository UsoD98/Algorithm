import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int[] solution(int[][] score) {
        
        int[] answer = new int[score.length];
        ArrayList<Integer> sum = new ArrayList<>();
        
        for(int i=0;i<score.length;i++){
            int currentSum = score[i][0] + score[i][1];
            answer[i] = currentSum;
            sum.add(currentSum);
        }
        
        int grade = sum.size();
        ArrayList<Integer> sortedSum = new ArrayList<>(sum);
        sortedSum.sort(Comparator.reverseOrder());

        for(int i=0;i<sum.size();i++){
            int index = sortedSum.indexOf(sum.get(i));
            answer[i] = index + 1;
        }

        return answer;
    }
}
