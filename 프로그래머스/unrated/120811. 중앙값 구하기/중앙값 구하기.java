class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int term = array[i];
                    array[i] = array[j];
                    array[j] = term;
                }
            }
        }
        int share = array.length / 2;
        answer = array[share];
        return answer;
    }
}