import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i=2;
        int idx=0;
        int[] ans_2 = new int[1];
        if(n==2){
            ans_2[0] = 2;
            return ans_2;
        }
        while(n>2){
            if(n%i==0){
                n/=i;
                if(!arr.contains(i)){
                    arr.add(i);
                }
                idx+=1;
            }
            else{
                i += 1;
            }
        }
        System.out.println(arr);
        int index=0;
        int[] answer = new int[arr.size()];
        for (Integer data : arr) {
            answer[index++] = data;
        }
        return answer;
    }
}