class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        int root = (Math.sqrt(total)%1==0) ? (int)Math.sqrt(total) : (int)Math.sqrt(total)+1;

        for(int i=root;i<=total;i++){
            if(total%i==0){
                int col=i;
                int row=total/i;
                if((col-2) * (row-2) == yellow){
                    answer[0]=col;
                    answer[1]=row;
                    break;       
                }
            }
        }
        return answer;
    }
}