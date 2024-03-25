class Solution {
    public int solution(int a, int b) {
        String a_First = "" + a + b;
        String b_First = "" + b + a;

        int a_First_ParseInt = Integer.parseInt(a_First);
        int b_First_ParseInt = Integer.parseInt(b_First);
        
        if(a_First_ParseInt > b_First_ParseInt){
            return a_First_ParseInt;
        }else return b_First_ParseInt;
    }
}