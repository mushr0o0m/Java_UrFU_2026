package lr2.Task8.Shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Круг:");
        System.out.println("Площадь = " + circle.getArea());
        System.out.println("Периметр = " + circle.getPerimeter());

        System.out.println();

        System.out.println("Квадрат:");
        System.out.println("Площадь = " + square.getArea());
        System.out.println("Периметр = " + square.getPerimeter());

        System.out.println();

        System.out.println("Треугольник:");
        System.out.println("Площадь = " + triangle.getArea());
        System.out.println("Периметр = " + triangle.getPerimeter());
    }
}