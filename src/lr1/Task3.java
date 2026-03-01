package lr1;

import java.util.Scanner;

public class Task3 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input dayOfWeekName: ");
        String dayOfWeekName = in.nextLine();

        System.out.println("Input monthName: ");
        String monthName = in.nextLine();

        System.out.println("Input date (day in month): ");
        int date = in.nextInt();

        System.out.printf("Day Of Week Name: %s Month Name: %s Date: %d", dayOfWeekName, monthName, date );
        in.close();
    }
}
