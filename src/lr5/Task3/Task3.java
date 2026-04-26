package lr5.Task3;
import java.util.Arrays;

public class Task3 {
    public static int[] getCommonElements(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1)
                .filter(n -> Arrays.stream(arr2).anyMatch(m -> m == n))
                .toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        System.out.println("До: " + Arrays.toString(arr1) + " и " + Arrays.toString(arr2));
        System.out.println("После: " + Arrays.toString(getCommonElements(arr1, arr2)));
    }
}
