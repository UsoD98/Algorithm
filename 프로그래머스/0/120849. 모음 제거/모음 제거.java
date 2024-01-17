class Solution {
    public String solution(String my_string) {
        String[] alp = {"a","e","i","o","u"};
        for (int i = 0; i < alp.length; i++) {
            if(my_string.contains(alp[i])){
                my_string=my_string.replace(alp[i],"");
            }
        }
        return my_string;
    }
}