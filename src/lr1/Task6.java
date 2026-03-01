package lr1;

import java.time.Year;
import java.util.Scanner;

public class Task6 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentYear = Year.now().getValue();

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input year of birth: ");
        int age = currentYear - in.nextInt();

        System.out.printf("Name: %s Age: %d", name, age );
        in.close();
    }
}
