package lr6.Task6;

import java.util.Scanner;

public class Task6 {

    public static int findSum(int[] array) throws InterruptedException {
        int numberOfThreads = Runtime.getRuntime().availableProcessors();
        SumThread[] threads = new SumThread[numberOfThreads];

        if (numberOfThreads > array.length) {
            numberOfThreads = array.length;
            threads = new SumThread[numberOfThreads];
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

            threads[i] = new SumThread(array, start, end);
            threads[i].start();

            start = end;
        }

        int sum = 0;

        for (int i = 0; i < numberOfThreads; i++) {
            threads[i].join();
            sum += threads[i].getSum();
        }

        return sum;
    }

    static class SumThread extends Thread {
        private int[] array;
        private int start;
        private int end;
        private int sum;

        public SumThread(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
            this.sum = 0;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
        }

        public int getSum() {
            return sum;
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

        int sum = findSum(numbers);

        System.out.println("Сумма элементов массива: " + sum);

        scanner.close();
    }
}