package lr4.Task2.Task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int n = Integer.parseInt(scanner.nextLine());

            System.out.println("Введите элементы массива:");
            String line = scanner.nextLine();

            String[] parts = line.trim().split("\\s+");

            if (parts.length > n) {
                throw new Exception("Введено больше элементов, чем указано");
            }

            if (parts.length < n) {
                throw new Exception("Введено меньше элементов, чем указано");
            }

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }

            int sum = 0;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] <= 0) {
                    throw new Exception("Обнаружено неположительное число");
                }

                sum += arr[i];
                count++;
            }

            if (count == 0) {
                throw new ArithmeticException("Все элементы неположительные");
            }

            double avg = (double) sum / count;
            System.out.println("Среднее значение: " + avg);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не число");

        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());

        } finally {
            System.out.println("Программа завершена");
        }

        scanner.close();
    }
}