package lr6.Task4;

public class Task4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            final int threadNumber = i;

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Поток номер: " + threadNumber);
                }
            });

            thread.start();
        }
    }
}