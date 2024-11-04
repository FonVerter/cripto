import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Привет! Что будем делать?\n-1 Шифровать \n-2 Расшифровывать\n-3 Расшифруем послание с помощью подбора");

        Scanner helloScanner = new Scanner(System.in);

        switch (helloScanner.nextInt()) {
            case 1:
                System.out.println("Введи путь к файлу который надо зашифровать:");
                Scanner pathToOriginalFile = new Scanner(System.in);
                String pathToFile = pathToOriginalFile.nextLine();
                System.out.println("Введи секретный ключ:");
                Scanner secretKey = new Scanner(System.in);
                int shiftValue = secretKey.nextInt();
                FileManager fileManagerTest = new FileManager(pathToFile);
                String readingFilesString = fileManagerTest.readUserFile();
                Cipher russianAlphabet = new Cipher();
                HashMap<Character, Character> newAlphabet = russianAlphabet.createNewAlphabet(shiftValue);
                String s = russianAlphabet.encryptTheString(readingFilesString, newAlphabet);
                fileManagerTest.writeTheUserFile(s);
                System.out.println("Файл успешно зашифрован. Адрес зашифрованного файла: \n" + fileManagerTest.getPathIn());
                break;

            case 2:
                System.out.println("Тут будем дешифровывать");
                break;

            case 3:
                System.out.println("Здесь будем дешифровывать методом брутфорс");

        }



    }
}