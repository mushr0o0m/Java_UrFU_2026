package lr1;

import java.util.Scanner;

public class Task8 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input x: ");
        int x = in.nextInt();

        System.out.println("Input y: ");
        int y = in.nextInt();

        int res = x + y;

        System.out.printf("Result %d", res );
        in.close();
    }
}
