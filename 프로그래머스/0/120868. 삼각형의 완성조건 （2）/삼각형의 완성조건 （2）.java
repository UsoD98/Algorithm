class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int side : sides) {
            if (side < min) min = side;
            if (side > max) max = side;
        }
        
        int sum = min + max;
        //가장 긴 변이 max인 경우
        for(int i=1;i<max;i++){
            if(min + i > max){
                answer += 1;
            }
        }
        
        //가장 긴 변이 max와 나머지 한 변인 경우
        if(min + max > max){
            answer += 1;
        }
        
        //나머지 한 변이 가장 긴 변인 경우
        for(int i=max+1;i<sum;i++){
            answer += 1;
        }
        
        return answer;
    }
}