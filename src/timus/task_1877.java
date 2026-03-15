package timus;
import java.util.Scanner;

public class task_1877 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lock1 = scanner.nextLine();
        String lock2 = scanner.nextLine();

        int code1 = Integer.parseInt(lock1);
        int code2 = Integer.parseInt(lock2);

        if (code1 % 2 == 0 || code2 % 2 != 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
