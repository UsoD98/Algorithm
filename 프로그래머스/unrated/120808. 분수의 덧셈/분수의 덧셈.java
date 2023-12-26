class Solution {
    public static int lcm(int a,int b){
        int min = Math.min(a,b);
        int mul = 1;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                mul= mul*i;
                a/=i;
                b/=i;
            }
        }      
        return a*b*mul;
    }
    public static int gcd(int a, int b){
        int min = Math.min(a,b);
        int i;
        int result=0;
        for(i=min;i>0;i--){
            if(a%i==0 && b%i==0){
                result = i;
                break;
            }
        }
        return result;
    }
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int denom = denom1*denom2;
        int numer = numer1*denom2+numer2*denom1;
        answer[0]=numer/gcd(numer,denom);
        answer[1]=denom/gcd(numer,denom);
        return answer;
    }
}