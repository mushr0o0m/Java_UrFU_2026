package lr5.Task8;
import java.util.*;
import java.util.stream.Collectors;

public class Task8 {
    public static List<String> longerThan(List<String> list, int length) {
        return list.stream()
                .filter(s -> s.length() > length)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hi", "hello", "java", "a");

        System.out.println("До: " + list);
        System.out.println("После: " + longerThan(list, 3));
    }
}