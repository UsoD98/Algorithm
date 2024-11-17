import java.io.*;
import java.util.StringTokenizer;

public class Main {
    //수 N개 주어짐
    //합을 구하는 횟수 M
    //i번째~ j번째까지 합 구하기

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M= Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] nums = new int[N+1];
        for (int i = 1; i <= N; i++) {
            nums[i] = nums[i-1]+Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(nums[b] - nums[a-1]);

        }

    }
}

