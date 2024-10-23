import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {

    private String originalFilePath;
    private String pathToTheModifiedFile; //нужен ли он здесь?
    private Path path;
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

    public byte[] readTheUserFile (){
        path = Path.of(originalFilePath);
        path = path.toAbsolutePath();
        byte [] originalFileBytesArray = null;
        try {
            originalFileBytesArray = Files.readAllBytes(path);
            System.out.println("Успешно прочел файл" + "\nКоличество байт в файле: " + originalFileBytesArray.length);
        } catch (IOException e) {
            e.getMessage();
        }

        return originalFileBytesArray;
    }

    public byte[] writeTheUserFile(byte [] modifiedFileBytesArray){

        // будет позднее

        return null;
    }


}
