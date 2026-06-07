package lr8.example4;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ReadExcelFileExample {
    public static void main(String[] args) {
        String fileName = "src/lr8/example4/example.xlsx";
        String sheetName = "Товары";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                readExcelFile(fileName, sheetName);
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Ошибка: файл " + fileName + " не найден.");
                System.out.println("Проверьте путь к файлу и попробуйте снова.");
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: лист \"" + sheetName + "\" отсутствует в файле.");
                System.out.println("Проверьте имя листа и попробуйте снова.");
            } catch (IOException e) {
                System.out.println("Ошибка чтения Excel-файла.");
                System.out.println("Проверьте, что файл не поврежден и имеет формат .xlsx.");
            }

            System.out.print("Нажмите Enter для повторной попытки или введите 0 для выхода: ");
            String choice = scanner.nextLine();
            if ("0".equals(choice)) {
                break;
            }
        }
    }

    private static void readExcelFile(String fileName, String sheetName) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(fileName);
             XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {

            XSSFSheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new IllegalArgumentException();
            }

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
        }
    }
}
