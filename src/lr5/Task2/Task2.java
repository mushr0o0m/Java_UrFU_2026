package lr5.Task2;
import java.util.Arrays;

public class Task2 {
    public static int[] getEvenNumbers(int[] arr) {
        return Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("До: " + Arrays.toString(arr));
        System.out.println("После: " + Arrays.toString(getEvenNumbers(arr)));
    }
}