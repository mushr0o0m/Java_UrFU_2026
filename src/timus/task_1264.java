package timus;

import java.util.Scanner;

public class task_1264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        long M = scanner.nextLong();

        long result = N * (M + 1);

        System.out.println(result);
    }
}
