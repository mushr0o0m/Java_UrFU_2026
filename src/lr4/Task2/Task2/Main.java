package lr4.Task2.Task2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            System.out.print("Введите номер столбца: ");
            int col = scanner.nextInt();

            System.out.println("Столбец:");

            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][col]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не число");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: столбца с таким номером не существует");

        } catch (Exception e) {
            System.out.println("Общая ошибка: " + e);

        } finally {
            System.out.println("Программа завершена");
        }

        scanner.close();
    }
}
