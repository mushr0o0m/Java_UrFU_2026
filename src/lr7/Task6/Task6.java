package lr7.Task6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите имя файла: ");
        String fileName = input.nextLine();

        System.out.print("Введите слово для поиска: ");
        String word = input.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                if (line.contains(word)) {
                    System.out.println(line);
                }
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}