package EX44;
import java.io.File;
public class genFile {

    private String fileName;

    File getFile() {
         return getFile();
     }

    File getFile(String fileName) {
        File result = null;
        this.fileName = fileName;
        File JSONFile = new File(fileName);
        if (!JSONFile.exists()) {
            System.out.print("The file could not be found.");
        } else {
            result = JSONFile;
        }
        return result;
    }
}
