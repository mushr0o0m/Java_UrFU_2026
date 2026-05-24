package lr7.Example2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "src/lr7/Example2/example_file.txt";

        // Ввод данных с консоли
        System.out.println("Введите данные для записи в файл:");
        String data = scanner.nextLine();

        // Запись данных в файл
        try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
            outputStream.write(data.getBytes());
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        // Чтение данных из файла
        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String readData = new String(buffer, 0, bytesRead);
            System.out.println("Прочитанные данные: " + readData);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        // Удаление файла
        System.out.print("Удалить файл? (да/нет): ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("да")) {
            if (new java.io.File(fileName).delete()) {
                System.out.println("Файл удален: " + fileName);
            } else {
                System.out.println("Не удалось удалить файл: " + fileName);
            }
        }

        scanner.close();
    }
}