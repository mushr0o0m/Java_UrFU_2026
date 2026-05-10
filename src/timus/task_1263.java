package timus;

import java.util.Scanner;

public class task_1263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] votes = new int[n];

        for (int i = 0; i < m; i++) {
            int candidate = scanner.nextInt();
            votes[candidate - 1]++;
        }

        for (int i = 0; i < n; i++) {
            double percent = (double) votes[i] * 100 / m;
            System.out.printf("%.2f%%%n", percent);
        }

        scanner.close();
    }
}
