class Solution {
    public int solution(int[] num_list) {
        boolean isLong = num_list.length >= 11;
        int longSum = 0;
        int shortMul = 1;
        if(isLong){
            for(int num : num_list){
                longSum += num;
            }
            return longSum;
        }else{
            for(int num : num_list){
                shortMul *= num;
            }
            return shortMul;
        }
    }
}