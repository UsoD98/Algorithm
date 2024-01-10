class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int x, y, z;
        x = box[0] / n;
        y = box[1] / n;
        z = box[2] / n;
        answer = x * y * z;
        return answer;
    }
}