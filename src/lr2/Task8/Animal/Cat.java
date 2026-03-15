package lr2.Task8.Animal;

public class Cat extends Animal {
    private String foodType;

    public Cat(String name, int age, String foodType) {
        super(name, age);
        this.foodType = foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Мяу-мяу");
    }
}