class Solution {
    public int solution(int n) {
        //조건1. n의 다음 큰 숫자는 n보다 큰 자연수        
        //조건2. n의 다음 큰 숫자와 n은 2진수로 변환했을 떄 1의 갯수가 같음
        //조건3. n의 다음 큰 숫자는 조건 1,2를 만족하는 수 중 가장 작은 수
        
        //n을 2진수로 바꾸기(nToBinary)
        String nToBi = Integer.toBinaryString(n);
        //nToBinary의 1의 개수 구하기
        int nBiOnes = 0;
        for(int i=0;i<nToBi.length();i++){
            if(nToBi.charAt(i)=='1'){
                nBiOnes += 1;
            }
        }

        //n보다 큰 수 중에서 이진수 변환 시 1 갯수가 같은 수 찾으면 break
        for(int i=n+1;i<Math.pow(n,2);i++){
            String nextNBi = Integer.toBinaryString(i);
            int nextNBiOnes = 0;
            for(int j=0;j<nextNBi.length();j++){
                if(nextNBi.charAt(j)=='1'){
                    nextNBiOnes += 1;
                }
            }
            if(nBiOnes == nextNBiOnes){
                return i;
            }
        }
        return -1;
    }
}