package lr2;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];

        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
            System.out.print(array[i] + " ");
        }

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("\nМинимальный элемент: " + min);
        System.out.print("Индексы минимального элемента: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}
