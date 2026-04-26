package lr5.Task9;
import java.util.*;
import java.util.stream.Collectors;

public class Task9 {
    public static List<Integer> greaterThan(List<Integer> list, int value) {
        return list.stream()
                .filter(n -> n > value)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 3, 7, 2);

        System.out.println("До: " + list);
        System.out.println("После: " + greaterThan(list, 3));
    }
}