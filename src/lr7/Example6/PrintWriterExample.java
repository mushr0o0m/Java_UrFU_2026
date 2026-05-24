package lr7.Example6;
import java.io.*;
import java.io.*;
import java.util.Scanner;

public class PrintWriterExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFileName = "src/lr7/Example6/input.txt";
        String outputFileName = "src/lr7/Example6/output.txt";

        // Ввод данных с консоли и запись в input.txt
        System.out.println("Введите данные для записи в исходный файл (можно использовать формат: число, текст и т.д.):");
        try (PrintWriter inputFileWriter = new PrintWriter(inputFileName, "UTF-8")) {
            System.out.print("Введите текст: ");
            String text = scanner.nextLine();
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            inputFileWriter.printf("Текст: %s, Число: %d%n", text, number);
            System.out.println("Исходные данные сохранены в: " + inputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи исходного файла: " + e.getMessage());
        }

        // Чтение и преобразование данных
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName));
             PrintWriter printWriter = new PrintWriter(outputFileName, "UTF-8")) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line.toUpperCase());
            }

            System.out.println("Данные записаны в файл (в верхнем регистре): " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }

        scanner.close();
    }
}