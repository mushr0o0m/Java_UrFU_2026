package lr7.Example4;
import java.io.*;
import java.util.Scanner;

public class BufferedStreamExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "example_file.txt";

        // Ввод данных с консоли (можно ввести несколько строк)
        System.out.println("Введите данные для записи в файл (для завершения введите пустую строку):");
        StringBuilder dataBuilder = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            dataBuilder.append(line).append(System.lineSeparator());
        }
        String data = dataBuilder.toString();

        // Запись данных в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        // Чтение данных из файла
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            char[] buffer = new char[1024];
            int charRead = reader.read(buffer);
            String readData = new String(buffer, 0, charRead);
            System.out.println("Прочитанные данные:\n" + readData);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        // Удаление файла
        System.out.print("Удалить файл? (да/нет): ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("да")) {
            if (new File(fileName).delete()) {
                System.out.println("Файл удален: " + fileName);
            } else {
                System.out.println("Не удалось удалить файл: " + fileName);
            }
        }

        scanner.close();
    }
}