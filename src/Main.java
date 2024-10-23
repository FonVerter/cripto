import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        String patttthTest = scanner.nextLine();

        FileManager fileManagerTest = new FileManager(patttthTest);
        System.out.println("Информация о прочитанном файле ");
        System.out.println("---".repeat(50));
        fileManagerTest.readTheUserFile();
        System.out.println("---".repeat(50));
        System.out.println("Отчет закончен");

    }
}