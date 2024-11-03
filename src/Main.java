import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите путь к файлу который надо зашифровать");
        String patttthTest = scanner.nextLine();

        System.out.println("Введите смещение алфавита");
        int shiftValue = scanner.nextInt();

        System.out.println("Введите путь к файлу в который запишем результат");
        Scanner scanner1 = new Scanner(System.in);
        String pathResultFiles = scanner1.nextLine();

        FileManager fileManagerTest = new FileManager(patttthTest);
        System.out.println("Информация о прочитанном файле ");
        System.out.println("---".repeat(50));
        String readingFilesString = fileManagerTest.readUserFile();
        System.out.println("---".repeat(50));
        System.out.println("Отчет закончен");
        System.out.println("---".repeat(50));


        System.out.println("Преобразование алфавита");
        Cipher russianAlphabet = new Cipher();
        HashMap<Character, Character> newAlphabet = russianAlphabet.createNewAlphabet(shiftValue);

        String s = russianAlphabet.encryptTheString(readingFilesString, newAlphabet);


        FileManager fileOutputManager = new FileManager(pathResultFiles, 1);
        fileOutputManager.writeTheUserFile(s);


    }
}