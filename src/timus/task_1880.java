package timus;
import java.util.Scanner;

public class task_1880 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++) {
            a[i] = scanner.nextInt();
        }

        int n2 = scanner.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i < n2; i++) {
            b[i] = scanner.nextInt();
        }

        int n3 = scanner.nextInt();
        int[] c = new int[n3];
        for (int i = 0; i < n3; i++) {
            c[i] = scanner.nextInt();
        }

        int i = 0, j = 0, k = 0;
        int count = 0;

        while (i < n1 && j < n2 && k < n3) {
            if (a[i] == b[j] && b[j] == c[k]) {
                count++;
                i++;
                j++;
                k++;
            } else {
                int min = Math.min(a[i], Math.min(b[j], c[k]));

                if (a[i] == min) i++;
                if (b[j] == min) j++;
                if (c[k] == min) k++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}
