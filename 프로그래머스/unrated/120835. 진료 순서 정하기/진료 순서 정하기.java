import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] arr_emergency = new int[emergency.length];
        for (int i = 0; i < arr_emergency.length; i++) {
            arr_emergency[i] = emergency[i];
        }
        Arrays.sort(arr_emergency);
        int rank = 1;
        int sub = 1;
        while(arr_emergency.length-sub>=0) {
            int max = arr_emergency[arr_emergency.length-sub];
            for (int i = 0; i < emergency.length; i++) {
                if (max == emergency[i]) {
                    answer[i] = rank;
                    rank += 1;
                }
            }
            sub += 1;
        }
        return answer;
    }
}