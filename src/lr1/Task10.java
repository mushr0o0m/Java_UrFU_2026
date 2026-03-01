package lr1;

import java.util.Scanner;

public class Task10 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a: ");
        int a = in.nextInt();

        System.out.print("Input b: ");
        int b = in.nextInt();

        int sum = a + b;
        int difference = a - b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        in.close();
    }
}
