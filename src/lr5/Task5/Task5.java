package lr5.Task5;
import java.util.*;
import java.util.stream.Collectors;

public class Task5 {
    public static List<Integer> getSquares(List<Integer> list) {
        return list.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        System.out.println("До: " + list);
        System.out.println("После: " + getSquares(list));
    }
}