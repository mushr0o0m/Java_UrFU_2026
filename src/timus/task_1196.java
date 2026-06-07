package timus;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class task_1196 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(br.readLine()));
        }

        int m = Integer.parseInt(br.readLine());
        long count = 0;

        for (int i = 0; i < m; i++) {
            int year = Integer.parseInt(br.readLine());
            if (set.contains(year)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
