package lr3.Task3.Task6;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    static void main(String[] args) {
        int N = 10;
        System.out.println("Победитель: " + solve(N));
    }

    public static int solve(int n) {
        List<Integer> list = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int index = 0;

        while (list.size() > 1) {
            index = (index + 1) % list.size();
            list.remove(index);
        }

        return list.getFirst();
    }
}
