class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int xmax=dots[0][0],
            xmin=dots[0][0],
            ymax=dots[0][1],
            ymin=dots[0][1];
        for (int i = 0; i < dots.length; i++) {
            if(xmax<dots[i][0]){
                xmax=dots[i][0];
            }
            if(xmin>dots[i][0]){
                xmin=dots[i][0];
            }
            if(ymax<dots[i][1]){
                ymax=dots[i][1];
            }
            if(ymin>dots[i][1]){
                ymin=dots[i][1];
            }
        }
        answer=(xmax-xmin)*(ymax-ymin);
        return answer;
    }
}