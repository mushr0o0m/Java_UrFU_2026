package lr8.example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class CreateXMLFile {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();

            Element root = doc.createElement("birthdays");
            doc.appendChild(root);

            addBirthday(doc, root, "Иван Петров", "12.03.2001");
            addBirthday(doc, root, "Мария Соколова", "25.07.1999");
            addBirthday(doc, root, "Алексей Иванов", "08.11.2001");

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/lr8/example1/example.xml"));
            transformer.transform(source, result);

            System.out.println("XML-файл создан.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addBirthday(Document doc, Element root, String name, String date) {
        Element birthday = doc.createElement("birthday");

        Element nameElement = doc.createElement("name");
        nameElement.appendChild(doc.createTextNode(name));
        birthday.appendChild(nameElement);

        Element dateElement = doc.createElement("date");
        dateElement.appendChild(doc.createTextNode(date));
        birthday.appendChild(dateElement);

        root.appendChild(birthday);
    }
}
