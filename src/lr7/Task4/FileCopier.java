package lr7.Task4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopier {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src/lr7/Task4/input.txt");
             FileWriter writer = new FileWriter("src/lr7/Task4/output.txt")) {

            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
            System.out.println("Файл скопирован успешно!");

        } catch (IOException e) {
            System.out.println("Ошибка при копировании файла: " + e.getMessage());
        }
    }
}