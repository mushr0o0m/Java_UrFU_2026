package lr7.Task8;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Task8 {
    public static void main(String[] args) {
        Person person = new Person("Kirill", 22, 180.5);

        try {
            ObjectOutputStream output =
                    new ObjectOutputStream(new FileOutputStream("src/lr7/Task8/output.txt"));

            output.writeObject(person);
            output.close();

            ObjectInputStream input =
                    new ObjectInputStream(new FileInputStream("src/lr7/Task8/input.txt"));

            Person restoredPerson = (Person) input.readObject();
            input.close();

            System.out.println("Имя: " + restoredPerson.name);
            System.out.println("Возраст: " + restoredPerson.age);
            System.out.println("Рост: " + restoredPerson.height);

        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }
}