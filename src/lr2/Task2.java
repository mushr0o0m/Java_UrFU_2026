package lr2;

public class Task2 {
    public static void main(String[] args) {
        int rows = 6;
        int cols = 7;

        int[][] array = new int[rows][cols];
        int num = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = num++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    array[i][j] = num++;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }
}
