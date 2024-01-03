import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {

    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = -1;
        if (array.length == 1) {
            answer = array[0];
        } else {
            int max = array[array.length - 1];
            int[] arr = new int[max + 1];
            int[] cnt = new int[max + 1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
                for (int data : array) {
                    if (data == arr[i]) {
                        cnt[i] += 1;
                    }
                }
            }
            int cnt_max = Arrays.stream(cnt).max().getAsInt();
            int count = 0;
            for (int i = 0; i < cnt.length; i++) {
                if (cnt_max == cnt[i]) {
                    answer = i;
                    count++;
                }
                if (count >= 2) {
                    answer = -1;
                    break;
                }
            }

        }
        return answer;
    }

}