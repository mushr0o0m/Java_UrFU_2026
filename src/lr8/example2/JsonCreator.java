package lr8.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class JsonCreator {
    public static void main(String[] args) {
        JSONObject root = new JSONObject();
        JSONArray birthdays = new JSONArray();

        JSONObject birthday1 = new JSONObject();
        birthday1.put("name", "Иван Петров");
        birthday1.put("date", "12.03.2001");

        JSONObject birthday2 = new JSONObject();
        birthday2.put("name", "Мария Соколова");
        birthday2.put("date", "25.07.1999");

        JSONObject birthday3 = new JSONObject();
        birthday3.put("name", "Алексей Иванов");
        birthday3.put("date", "08.11.2001");

        birthdays.add(birthday1);
        birthdays.add(birthday2);
        birthdays.add(birthday3);

        root.put("birthdays", birthdays);

        try (FileWriter file = new FileWriter("src/lr8/example2/example-json.json")) {
            file.write(root.toJSONString());
            System.out.println("Json файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
