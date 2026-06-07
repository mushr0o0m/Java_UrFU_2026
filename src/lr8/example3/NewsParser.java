package lr8.example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NewsParser {
    private static final String URL = "src/lr8/example3/news.html";
    private static final String FILE_PATH = "src/lr8/example3/news.txt";

    public static void main(String[] args) {
        try {
            Document doc = loadDocument();
            Elements titles = doc.getElementsByClass("blocktitle");
            Elements dates = doc.getElementsByClass("blockdate");

            if (titles.isEmpty() || dates.isEmpty()) {
                System.out.println("Ошибка: новости на странице не найдены.");
                System.out.println("Возможно, изменилась структура сайта.");
                return;
            }

            int newsCount = Math.min(titles.size(), dates.size());

            try (FileWriter writer = new FileWriter(FILE_PATH)) {
                for (int i = 0; i < newsCount; i++) {
                    Element titleElement = titles.get(i);
                    Element dateElement = dates.get(i);

                    String title = titleElement.text();
                    String date = dateElement.text();

                    System.out.println("Тема: " + title);
                    System.out.println("Дата: " + date + "\n");

                    writer.write("Тема: " + title + System.lineSeparator());
                    writer.write("Дата: " + date + System.lineSeparator());
                    writer.write(System.lineSeparator());
                }
            }

            System.out.println("Новости сохранены в файл.");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static Document loadDocument() throws IOException {
        File input = new File("src/lr8/example3/news.html");
        return Jsoup.parse(input, "UTF-8");
    }
}
