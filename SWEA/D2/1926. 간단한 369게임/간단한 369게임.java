import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String answer = "";

        for (int i = 1; i <= N; i++) {
            int count = countClap(i);
            if (count == 0) {
                answer += i + " ";
            } else {
                answer += repeatString("-", count) + " ";
            }
        }

        System.out.println(answer.trim());
    }

    private static int countClap(int num) {
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit == 3 || digit == 6 || digit == 9) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    private static String repeatString(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}