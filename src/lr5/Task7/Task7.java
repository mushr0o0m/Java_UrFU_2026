package lr5.Task7;
import java.util.*;
import java.util.stream.Collectors;

public class Task7 {
    public static List<Integer> divisibleBy(List<Integer> list, int divisor) {
        return list.stream()
                .filter(n -> n % divisor == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("До: " + list);
        System.out.println("После: " + divisibleBy(list, 2));
    }
}