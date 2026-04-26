package timus;

import java.util.Scanner;

public class task_1209 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long[] queries = new long[N];

        for (int i = 0; i < N; i++) {
            queries[i] = scanner.nextLong();
        }

        for (int i = 0; i < N; i++) {
            System.out.print(getDigit(queries[i]) + " ");
        }
    }

    public static int getDigit(long k) {
        long length = 1;
        long current = k;

        while (current > length) {
            current -= length;
            length++;
        }

        if (current == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
