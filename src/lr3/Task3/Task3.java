package lr3.Task3;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Размер массива: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        inputArray(scanner, arr, 0);
        System.out.print("Массив: ");
        printArray(arr, 0);
    }

    public static void inputArray(Scanner scanner, int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        System.out.print("Введите элемент [" + index + "]: ");
        arr[index] = scanner.nextInt();
        inputArray(scanner, arr, index + 1);
    }

    public static void printArray(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }
}