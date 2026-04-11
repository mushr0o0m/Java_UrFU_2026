package timus;
import java.util.Scanner;

public class task_2100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int total = 2;

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();

            total++;

            if (line.contains("+one")) {
                total++;
            }
        }

        if (total == 13) {
            total++;
        }

        int cost = total * 100;
        System.out.println(cost);

        scanner.close();
    }
}
