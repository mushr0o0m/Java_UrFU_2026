package lr5.Task10;
import java.util.*;
import java.util.stream.Collectors;

public class Task10 {
    public static List<String> onlyLetters(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world123", "java!", "code");

        System.out.println("До: " + list);
        System.out.println("После: " + onlyLetters(list));
    }
}