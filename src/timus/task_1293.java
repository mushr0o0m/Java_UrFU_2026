package timus;

import java.util.Scanner;

public class task_1293 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();

        long result = 2 * N * A * B;

        System.out.println(result);
    }
}
