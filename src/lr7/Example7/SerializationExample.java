package lr7.Example7;
import java.io.*;
import java.util.Scanner;

public class SerializationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "src/lr7/Example7/person.json";

        System.out.println("Ввод данных о человеке");
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        Person person = new Person(name, age);

        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(person);
            System.out.println("Объект Person сериализован в файл: " + fileName);

        } catch (IOException e) {
            System.out.println("Ошибка при сериализации: " + e.getMessage());
            scanner.close();
            return;
        }

        // Десериализация
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Person deserializedPerson = (Person) in.readObject();
            System.out.println("\nДесериализованный объект");
            System.out.println(deserializedPerson);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при десериализации: " + e.getMessage());
        }

        scanner.close();
    }
}