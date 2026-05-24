package lr7.Task7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write(text);
            writer.close();

            System.out.println("Количество записанных символов: " + text.length());
        } catch (IOException e) {
            System.out.println("Ошибка записи");
        }
    }
}