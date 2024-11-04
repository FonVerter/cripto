import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {

    private final String pathToOriginalFile;
    private Path pathIn;

    public Path getPathIn() {
        return pathIn;
    }

    public FileManager(String pathToOriginalFile) {
        this.pathToOriginalFile = pathToOriginalFile;
    }


    public String readUserFile() {
        pathIn = Path.of(pathToOriginalFile);

        String lineFromFile = " ";

        try {
            lineFromFile = Files.readString(pathIn);
        } catch (IOException e) {
            e.getMessage();
        }

        return lineFromFile;
    }

    public void writeTheUserFile(String modifiedString) {

        String newFileName = "modified_" + pathIn.getFileName();
        Path pathOut = Path.of(newFileName);

        try {
            Files.createFile(pathOut);
        } catch (IOException e) {
            e.getMessage();
        }

        try {
            Files.writeString(pathOut, modifiedString);
        } catch (IOException e) {
            e.getMessage();
        }


    }


}
