package lr1;

import java.util.Scanner;

public class Task9 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input x: ");
        int x = in.nextInt();
        int less = x - 1;
        int more = x + 1;
        int sum = less + x + more;
        int square = sum * sum;

        System.out.println(less + ", " + x + ", " + more + ", " + square);

        in.close();
    }
}
