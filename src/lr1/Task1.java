package lr1;

import java.util.Scanner;

public class Task1 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input firstname: ");
        String firstname = in.nextLine();

        System.out.println("Input surname: ");
        String surname = in.nextLine();

        System.out.println("Input middle name: ");
        String middleName = in.nextLine();

        System.out.printf("Hello Firstname: %s Surname: %s MiddleName: %s", firstname, surname, middleName );
        in.close();
    }
}
