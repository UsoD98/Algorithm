import java.util.ArrayList;
class Solution {
    public int solution(int[] num_list, int n) {
        ArrayList<Integer> new_list = new ArrayList<>();
        for(int num : num_list){
            new_list.add(num);
        }
        if(new_list.contains(n)){
            return 1;
        } else return 0;
    }
}