import java.util.ArrayList;

class Solution {
    public int count(int num){
        ArrayList<Integer> arr = new ArrayList<>();
        int sqrt = (int)Math.sqrt(num)+1;
        for(int i=1;i<sqrt;i++){
            if(num%i==0){
                arr.add(i);
            }
        }
        return arr.size()*2;
    }

    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(count(i)>=3){
                answer += 1;
            }
        }
        return answer;
    }
}