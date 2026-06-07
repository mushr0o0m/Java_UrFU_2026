package lr8.example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class XmlParser {
    private static final String FILE_PATH = "src/lr8/example1/example.xml";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("1 - Показать все дни рождения");
            System.out.println("2 - Добавить запись");
            System.out.println("3 - Найти по имени");
            System.out.println("4 - Найти по году рождения");
            System.out.println("5 - Удалить по имени");
            System.out.println("0 - Выход");
            System.out.print("Выберите действие: ");

            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    case "1":
                        showAllBirthdays();
                        break;
                    case "2":
                        addBirthday(scanner);
                        break;
                    case "3":
                        findByName(scanner);
                        break;
                    case "4":
                        findByYear(scanner);
                        break;
                    case "5":
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
        Document doc = loadDocument();
        NodeList nodeList = doc.getElementsByTagName("birthday");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                printBirthday((Element) node);
            }
        }
    }

    private static void addBirthday(Scanner scanner) throws Exception {
        Document doc = loadDocument();
        Element root = doc.getDocumentElement();

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите дату рождения: ");
        String date = scanner.nextLine();

        Element birthday = doc.createElement("birthday");

        Element nameElement = doc.createElement("name");
        nameElement.appendChild(doc.createTextNode(name));
        birthday.appendChild(nameElement);

        Element dateElement = doc.createElement("date");
        dateElement.appendChild(doc.createTextNode(date));
        birthday.appendChild(dateElement);

        root.appendChild(birthday);
        saveDocument(doc);
        System.out.println("Запись добавлена.");
    }

    private static void findByName(Scanner scanner) throws Exception {
        Document doc = loadDocument();
        NodeList nodeList = doc.getElementsByTagName("birthday");

        System.out.print("Введите имя для поиска: ");
        String searchName = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String name = element.getElementsByTagName("name").item(0).getTextContent();

                if (name.equalsIgnoreCase(searchName)) {
                    printBirthday(element);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Совпадений не найдено.");
        }
    }

    private static void findByYear(Scanner scanner) throws Exception {
        Document doc = loadDocument();
        NodeList nodeList = doc.getElementsByTagName("birthday");

        System.out.print("Введите год рождения для поиска: ");
        String searchYear = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String date = element.getElementsByTagName("date").item(0).getTextContent();

                if (date.endsWith(searchYear)) {
                    printBirthday(element);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Совпадений не найдено.");
        }
    }

    private static void deleteByName(Scanner scanner) throws Exception {
        Document doc = loadDocument();
        NodeList nodeList = doc.getElementsByTagName("birthday");

        System.out.print("Введите имя для удаления: ");
        String deleteName = scanner.nextLine();
        boolean deleted = false;

        for (int i = nodeList.getLength() - 1; i >= 0; i--) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String name = element.getElementsByTagName("name").item(0).getTextContent();

                if (name.equalsIgnoreCase(deleteName)) {
                    element.getParentNode().removeChild(element);
                    deleted = true;
                }
            }
        }

        if (deleted) {
            saveDocument(doc);
            System.out.println("Запись удалена.");
        } else {
            System.out.println("Совпадений не найдено.");
        }
    }

    private static Document loadDocument() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new File(FILE_PATH));
        doc.getDocumentElement().normalize();
        return doc;
    }

    private static void saveDocument(Document doc) throws Exception {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(FILE_PATH));
        transformer.transform(source, result);
    }

    private static void printBirthday(Element element) {
        System.out.println("Имя: " + element.getElementsByTagName("name").item(0).getTextContent());
        System.out.println("Дата рождения: " + element.getElementsByTagName("date").item(0).getTextContent());
        System.out.println();
    }
}
