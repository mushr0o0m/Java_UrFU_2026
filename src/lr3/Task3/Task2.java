package lr3.Task3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        System.out.print("Двоичное представление: ");
        toBinary(number);
    }

    public static void toBinary(int n) {
        if (n == 0) {
            return;
        }
        toBinary(n / 2);
        System.out.print(n % 2);
    }
}