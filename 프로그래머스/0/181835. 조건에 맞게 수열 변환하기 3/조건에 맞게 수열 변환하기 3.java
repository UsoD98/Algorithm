import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] arr, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int data : arr){
            if(k%2==1){
                answer.add(data*k);
            }else{
                answer.add(data+k);
            }
        }
        return answer;
    }
}