package timus;
import java.util.Scanner;

public class task_1820 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int time = (2 * n + k - 1) / k;

        System.out.println(time);
    }
}
