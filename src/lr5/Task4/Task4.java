package lr5.Task4;
import java.util.*;
import java.util.stream.Collectors;

public class Task4 {
    public static List<String> getUppercaseStrings(List<String> list) {
        return list.stream()
                .filter(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "Banana", "cat", "Dog");

        System.out.println("До: " + list);
        System.out.println("После: " + getUppercaseStrings(list));
    }
}
