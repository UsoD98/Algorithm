
import java.util.Arrays;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;

        for (String s : keyinput) {
            if (s.equals("right")) {
                x += 1;
                if (x > board[0] / 2) {
                    x = board[0] / 2;
                }
            } else if (s.equals("left")) {
                x -= 1;
                if (x < -(board[0] / 2)) {
                    x = -(board[0] / 2);
                }
            } else if (s.equals("up")) {
                y += 1;
                if (y > board[1] / 2) {
                    y = board[1] / 2;
                }
            } else {
                y -= 1;
                if (y < -(board[1] / 2)) {
                    y = -(board[1] / 2);
                }
            }
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}