package lr6.Task5;

import java.util.Scanner;

public class Task5 {

    public static int findMax(int[] array) throws InterruptedException {
        int numberOfThreads = Runtime.getRuntime().availableProcessors();
        MaxThread[] threads = new MaxThread[numberOfThreads];

        if (numberOfThreads > array.length) {
            numberOfThreads = array.length;
            threads = new MaxThread[numberOfThreads];
        }

        int partSize = array.length / numberOfThreads;
        int start = 0;

        for (int i = 0; i < numberOfThreads; i++) {
            int end;

            if (i == numberOfThreads - 1) {
                end = array.length;
            } else {
                end = start + partSize;
            }

            threads[i] = new MaxThread(array, start, end);
            threads[i].start();

            start = end;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numberOfThreads; i++) {
            threads[i].join();

            if (threads[i].getMax() > max) {
                max = threads[i].getMax();
            }
        }

        return max;
    }

    static class MaxThread extends Thread {
        private int[] array;
        private int start;
        private int end;
        private int max;

        public MaxThread(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
            this.max = Integer.MIN_VALUE;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }

        public int getMax() {
            return max;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = findMax(numbers);

        System.out.println("Максимальный элемент: " + max);

        scanner.close();
    }
}