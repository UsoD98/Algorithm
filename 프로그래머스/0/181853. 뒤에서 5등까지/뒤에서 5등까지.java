import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int num : num_list) {
            answer.add(num);
        }
        answer.sort(Comparator.naturalOrder());
        ArrayList<Integer> newArrayList = new ArrayList<>(answer.subList(0, 5));
        return newArrayList;
    }
}