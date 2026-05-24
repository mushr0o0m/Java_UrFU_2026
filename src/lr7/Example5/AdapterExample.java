package lr7.Example5;
import java.io.*;
import java.io.*;
import java.util.Scanner;

public class AdapterExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFileName = "src/lr7/Example5/input.txt";
        String outputFileName = "src/lr7/Example5/output.txt";

        // Ввод данных с консоли и запись в input.txt
        System.out.println("Введите данные для записи в исходный файл (для завершения введите 'end'):");
        try (BufferedWriter inputFileWriter = new BufferedWriter(new FileWriter(inputFileName))) {
            String line;
            while (!(line = scanner.nextLine()).equalsIgnoreCase("end")) {
                inputFileWriter.write(line);
                inputFileWriter.newLine();
            }
            System.out.println("Исходные данные сохранены в: " + inputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи исходного файла: " + e.getMessage());
        }

        // Копирование с преобразованием кодировки
        try (InputStream inputStream = new FileInputStream(inputFileName);
             InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
             OutputStream outputStream = new FileOutputStream(outputFileName);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line.toUpperCase()); // Преобразуем в верхний регистр
                bufferedWriter.newLine();
            }
            System.out.println("Данные скопированы и преобразованы в файл: " + outputFileName);

        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }

        scanner.close();
    }
}