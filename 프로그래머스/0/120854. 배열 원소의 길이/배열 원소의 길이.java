class Solution {
    public int[] solution(String[] strlist) {
        int len = strlist.length;
        int[] answer = new int[len];        //배열 길이 초기화
        for(int i=0;i<len;i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}