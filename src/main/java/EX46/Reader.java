package EX46;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Reader {

    private String fileString;

    public Reader(File file) throws IOException {
        fileString = FileUtils.readFileToString(file);
    }

    public String[] extractWords() {
        return fileString.split(" ");
    }

}