import java.util.Arrays;
import java.util.Scanner;

public class B11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] times = new int[n];

        for (int i = 0; i < n; i++) {
            times[i] = sc.nextInt();
        }

        Arrays.sort(times);

        int totaltime = 0;
        int accumulatedTime = 0;

        for (int i = 0; i < n; i++) {
            // (n-i) 사람들의 대기 시간에 현재 사람의 인출 시간을 더함
            totaltime += times[i] * (n - i);
        }

        System.out.println(totaltime);
    }
}
