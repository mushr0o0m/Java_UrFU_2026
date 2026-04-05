package lr3.Task3.Task1;

public class Example5 {

static void main (String[] args) {
    System.out.println(fact(5));
}

    public static int fact(int n) {
        System.out.println("Вызов fact(" + n + ")");

        if (n == 0) {
            System.out.println("Возврат 0 из fact(0)");
            return 0;
        } else if (n == 1) {
            System.out.println("Возврат 1 из fact(1)");
            return 1;
        } else {
            int result = fact(n - 2) + fact(n - 1);
            System.out.println("Возврат " + result + " из fact(" + n + ")");
            return result;
        }
    }
}
