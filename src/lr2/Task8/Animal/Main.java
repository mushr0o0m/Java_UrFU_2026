package lr2.Task8.Animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик", 3, "Овчарка");
        Cat cat = new Cat("Мурка", 2, "Сухой корм");
        Bird bird = new Bird("Кеша", 1, true);

        System.out.println("Собака:");
        System.out.println("Имя: " + dog.getName());
        System.out.println("Возраст: " + dog.getAge());
        System.out.println("Порода: " + dog.getBreed());
        dog.makeSound();

        System.out.println();

        System.out.println("Кошка:");
        System.out.println("Имя: " + cat.getName());
        System.out.println("Возраст: " + cat.getAge());
        System.out.println("Тип корма: " + cat.getFoodType());
        cat.makeSound();

        System.out.println();

        System.out.println("Птица:");
        System.out.println("Имя: " + bird.getName());
        System.out.println("Возраст: " + bird.getAge());
        System.out.println("Умеет летать: " + bird.getCanFly());
        bird.makeSound();
        bird.fly();
    }
}