package lr1;

import java.time.Year;
import java.util.Scanner;


public class Task7 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int currentYear = Year.now().getValue();

        System.out.println("Input age: ");
        int year = currentYear - in.nextInt();

        System.out.printf("Year of birth: %d", year );
        in.close();
    }
}
