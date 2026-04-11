package lr4.Task2.Task3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int n = Integer.parseInt(scanner.nextLine());

            if (n <= 0) {
                throw new Exception("Размер массива должен быть положительным");
            }

            System.out.println("Введите элементы массива:");
            String[] parts = scanner.nextLine().split(" ");

            if (parts.length != n) {
                throw new Exception("Неверное количество элементов");
            }

            byte[] arr = new byte[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = Byte.parseByte(parts[i]); // может дать ошибку
                sum += arr[i];

                // проверка переполнения byte
                if (sum < -128 || sum > 127) {
                    throw new Exception("Переполнение типа byte при вычислении суммы");
                }
            }

            System.out.println("Сумма: " + sum);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не число или число вне диапазона byte");

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());

        } finally {
            System.out.println("Программа завершена");
        }

        scanner.close();
    }
}
