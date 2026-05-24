package lr7.Task8;
import java.io.Serializable;
import java.io.Serializable;

public class Person implements Serializable {
    String name;
    int age;
    double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}