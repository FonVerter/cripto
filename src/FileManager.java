import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {

    private String pathToOriginalFile;
    private String pathToTheModifiedFile; //нужен ли он здесь?
    private Path pathIn;
    private Path pathOut;


    public FileManager(String pathToTheModifiedFile, int a) {
        this.pathToTheModifiedFile = pathToTheModifiedFile;
    }

    public FileManager(String pathToOriginalFile) {
        this.pathToOriginalFile = pathToOriginalFile;
    }


    public String readUserFile() {
        pathIn = Path.of(pathToOriginalFile);

        String lineFromFile = " ";

        try {
            lineFromFile = Files.readString(pathIn);
            System.out.println("Успешно прочел файл и записал его в виде строки");
        } catch (IOException e) {
            e.getMessage();
        }

        return lineFromFile;
    }

    public void writeTheUserFile(String modifiedString) {

        pathOut = Path.of(pathToTheModifiedFile);

        try {
            Files.writeString(pathOut, modifiedString);
        } catch (IOException e) {
            e.getMessage();
        }


    }


}
