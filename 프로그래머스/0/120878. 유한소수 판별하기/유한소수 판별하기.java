class Solution {
    public int isLimit(int a, int b){
        for(int i=1;i<=a;i++){
            if((a%i==0) && (b%i==0)){
                a /= i;
                b /= i;
            }
            if(i > a) break;
        }
        return b;
    }
    
    public int solution(int a, int b) {
        int answer = 0;
        b =  isLimit(a,b);
        while(true){
            if(b%2==0) b/=2;
            if(b%5==0) b/=5;
            
            if((b%2!=0) && (b%5!=0)){
                if(b != 1){
                    answer = 2;
                    break;
                } else{
                    answer = 1;
                    break;
                }
            }
        }
        return answer;
    }
}