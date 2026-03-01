package timus;

import java.util.Scanner;

public class task_2012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();

        int remainingTasks = 12 - f;
        int remainingTime = 240;

        if (remainingTasks * 45 <= remainingTime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
