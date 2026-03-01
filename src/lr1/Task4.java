package lr1;

import java.util.Scanner;

public class Task4 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input month Name: ");
        String monthName = in.nextLine();

        System.out.println("Input num of days in month: ");
        int num = in.nextInt();

        System.out.printf("Month Name: %s Num: %d", monthName, num );
        in.close();
    }
}
