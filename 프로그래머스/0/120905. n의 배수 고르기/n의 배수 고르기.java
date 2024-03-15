import java.util.ArrayList;
class Solution {
    public ArrayList solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int data : numlist){
            if(data % n == 0){
                answer.add(data);
            }
        }
        return answer;
    }
}