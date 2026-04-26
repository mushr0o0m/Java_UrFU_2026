package lr5.Task6;
import java.util.*;
import java.util.stream.Collectors;

public class Task6 {
    public static List<String> containsSubstring(List<String> list, String sub) {
        return list.stream()
                .filter(s -> s.contains(sub))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "help", "java");

        System.out.println("До: " + list);
        System.out.println("После: " + containsSubstring(list, "he"));
    }
}
