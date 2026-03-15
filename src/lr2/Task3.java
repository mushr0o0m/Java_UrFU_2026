package lr2;
import java.util.Scanner;

public class Task3 {
    public static String caesarCipher(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            char newCh = (char) (ch + key); // сдвиг по кодовой таблице символов
            result.append(newCh);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования");
        String text = scanner.nextLine();

        System.out.println("Введите ключ");
        int key = scanner.nextInt();
        scanner.nextLine();

        String encryptedText = caesarCipher(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String answer = scanner.nextLine();

            if (answer.equals("y")) {
                String decryptedText = caesarCipher(encryptedText, -key);
                System.out.println("Текст после преобразования: " + decryptedText);
                break;
            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }

        scanner.close();
    }
}
