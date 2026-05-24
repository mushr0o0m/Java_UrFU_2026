package lr7.Task5;

import java.io.File;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("Размер файла: " + file.length() + " байт");
        } else {
            System.out.println("Файл не найден");
        }
    }
}