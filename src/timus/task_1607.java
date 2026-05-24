package timus;
import java.util.Scanner;

public class task_1607 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        while (true) {
            if (a >= c) {
                System.out.println(a);
                break;
            }

            a += b;

            if (c <= a) {
                System.out.println(c);
                break;
            }

            c -= d;
        }
    }
}