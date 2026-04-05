package lr3.Task3;
import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Заполнение
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "three");
        map.put(3, "hello");
        map.put(4, "world");
        map.put(5, "java");
        map.put(6, "programming");
        map.put(7, "recursion");
        map.put(8, "array");
        map.put(9, "example");

        // 1. Строки, у которых ключ > 5
        System.out.println("Ключ > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }

        // 2. Если ключ = 0, вывести строки через запятую
        System.out.print("Ключ = 0: ");
        boolean first = true;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() == 0) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(entry.getValue());
                first = false;
            }
        }
        System.out.println();

        // 3. Перемножить ключи, где длина строки > 5
        int product = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
            }
        }

        System.out.println("Произведение ключей (длина строки > 5): " + product);
    }
}