import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {

    private String originalFilePath;
    private String pathToTheModifiedFile; //нужен ли он здесь?
    private Path pathIn;
    private Path pathOut;
    Files files;

    public FileManager(String originalFilePath) {
        this.originalFilePath = originalFilePath;
    }

    public String getOriginalFilePath() {
        return originalFilePath;
    }

    public void setOriginalFilePath(String originalFilePath) {
        this.originalFilePath = originalFilePath;
    }

    public String readTheUserFile (){
        pathIn = Path.of(originalFilePath);
        //pathIn = pathIn.toAbsolutePath();
        String lineFromFile = null;
        try {
            lineFromFile = Files.readString(pathIn);
            System.out.println("Успешно прочел файл и записал его в виде строки");
        } catch (IOException e) {
            e.getMessage();
        }

        return lineFromFile;
    }

    public String writeTheUserFile(String modifiedString){

        String outputString = "Файл успешно записан";

        pathOut = Path.of(pathToTheModifiedFile);

        //pathOut = pathOut.toAbsolutePath();




        return outputString;
    }


}
