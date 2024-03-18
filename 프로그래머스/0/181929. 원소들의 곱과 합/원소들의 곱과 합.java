class Solution {
    public int solution(int[] num_list) {
        int listSum = 0;
        int listMul = 1;
        for(int num : num_list){
            listSum += num;
            listMul *= num;
        }
        if(listMul < listSum*listSum){
            return 1;
        } else return 0;
    }
}