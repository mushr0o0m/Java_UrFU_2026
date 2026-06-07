package lr8.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class JsonParser {
    private static final String FILE_PATH = "src/lr8/example2/example-json.json";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("1 - Показать все дни рождения");
            System.out.println("2 - Найти по имени");
            System.out.println("3 - Добавить запись");
            System.out.println("4 - Удалить по имени");
            System.out.println("0 - Выход");
            System.out.print("Выберите действие: ");

            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    case "1":
                        showAllBirthdays();
                        break;
                    case "2":
                        findByName(scanner);
                        break;
                    case "3":
                        addBirthday(scanner);
                        break;
                    case "4":
                        deleteByName(scanner);
                        break;
                    case "0":
                        return;
                    default:
                        System.out.println("Неверный пункт меню.");
                }
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    private static void showAllBirthdays() throws Exception {
        JSONObject jsonObject = readJsonObject();
        JSONArray jsonArray = (JSONArray) jsonObject.get("birthdays");

        for (Object object : jsonArray) {
            JSONObject birthday = (JSONObject) object;
            printBirthday(birthday);
        }
    }

    private static void findByName(Scanner scanner) throws Exception {
        JSONObject jsonObject = readJsonObject();
        JSONArray jsonArray = (JSONArray) jsonObject.get("birthdays");

        System.out.print("Введите имя для поиска: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (Object object : jsonArray) {
            JSONObject birthday = (JSONObject) object;
            if (name.equalsIgnoreCase((String) birthday.get("name"))) {
                printBirthday(birthday);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Совпадений не найдено.");
        }
    }

    private static void addBirthday(Scanner scanner) throws Exception {
        JSONObject jsonObject = readJsonObject();
        JSONArray jsonArray = (JSONArray) jsonObject.get("birthdays");

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите дату рождения: ");
        String date = scanner.nextLine();

        JSONObject newBirthday = new JSONObject();
        newBirthday.put("name", name);
        newBirthday.put("date", date);
        jsonArray.add(newBirthday);

        writeJsonObject(jsonObject);
        System.out.println("Запись добавлена.");
    }

    private static void deleteByName(Scanner scanner) throws Exception {
        JSONObject jsonObject = readJsonObject();
        JSONArray jsonArray = (JSONArray) jsonObject.get("birthdays");

        System.out.print("Введите имя для удаления: ");
        String name = scanner.nextLine();
        boolean deleted = false;

        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            JSONObject birthday = (JSONObject) iterator.next();
            if (name.equalsIgnoreCase((String) birthday.get("name"))) {
                iterator.remove();
                deleted = true;
            }
        }

        if (deleted) {
            writeJsonObject(jsonObject);
            System.out.println("Запись удалена.");
        } else {
            System.out.println("Совпадений не найдено.");
        }
    }

    private static JSONObject readJsonObject() throws Exception {
        JSONParser parser = new JSONParser();
        return (JSONObject) parser.parse(new FileReader(FILE_PATH));
    }

    private static void writeJsonObject(JSONObject jsonObject) throws Exception {
        try (FileWriter fileWriter = new FileWriter(FILE_PATH)) {
            fileWriter.write(jsonObject.toJSONString());
        }
    }

    private static void printBirthday(JSONObject birthday) {
        System.out.println("Имя: " + birthday.get("name"));
        System.out.println("Дата рождения: " + birthday.get("date"));
        System.out.println();
    }
}
