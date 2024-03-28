import java.util.ArrayList;
class Solution {
    public long solution(long n) {
        ArrayList<Long> sum = new ArrayList<>();
        for(long i=0; i<=n; i++){
            if(i<=1){
                sum.add(i);
            } else {
                sum.add((sum.get((int)(i-1)) + sum.get((int)(i-2))) % 1234567);
            }
        }
        return sum.get((int)(n)) % 1234567;
    }
}