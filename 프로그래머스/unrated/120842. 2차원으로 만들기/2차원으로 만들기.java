import java.util.Arrays;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int row = 0;
        int coloum = 0;
        for (int data : num_list) {
            if(coloum==n){
                coloum = 0;
                row += 1;
            }
            answer[row][coloum] = data;
            coloum += 1;
        }

        return answer;
    }
}