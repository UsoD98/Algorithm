import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        // 숫자를 문자열로 변환
        String numberStr = String.valueOf(n);
        
        // ArrayList 생성 및 각 자릿수 추가
        ArrayList<Character> digits = new ArrayList<>();
        for (char digit : numberStr.toCharArray()) {
            digits.add(digit);
        }
        
        // 내림차순 정렬
        Collections.sort(digits, Collections.reverseOrder());
        
        // 정렬된 리스트를 다시 문자열로 변환
        StringBuilder sb = new StringBuilder(digits.size());
        for (Character digit : digits) {
            sb.append(digit);
        }
        
        // 문자열을 long으로 변환하여 반환
        return Long.parseLong(sb.toString());
    }
}