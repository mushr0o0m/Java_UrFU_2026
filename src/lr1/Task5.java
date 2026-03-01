package lr1;

import java.time.Year;
import java.util.Scanner;

public class Task5 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int currentYear = Year.now().getValue();

        System.out.println("Input year of birth: ");
        int year = in.nextInt();

        int res = currentYear - year;

        System.out.printf("Your age: %d", res );
        in.close();
    }
}
