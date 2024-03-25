class Solution {
    boolean solution(String s) {
        
        int start = 0;
        int end = s.length()-1;
        
        if(s.charAt(start)==')' || s.charAt(end)=='('){
            return false;
        }else{
            
            int left = 0;
            int right = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    left += 1;
                }else right += 1;
                if(left-right<0){
                    return false;
                }
            }

            if(left!=right){
                return false;
            }else return true;
        }

    }
}