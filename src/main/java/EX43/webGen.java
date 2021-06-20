package EX43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class webGen {
    String siteName;
    String author;
    String path;

    public String makeWeb(){
        String directory = path + siteName;
        File genFolder = new File(directory);
        genFolder.mkdirs();
        return directory;

    }
    public String genJSFolder(){
        String directory = path + siteName + "/js";
        File genFolder = new File(directory);
        genFolder = new File(directory);
        genFolder.mkdirs();
        return directory;

    }
    public String genCSSFolder(){
        String directory = path + siteName + "/css";
        File genFolder = new File(directory);
        genFolder = new File(directory);
        genFolder.mkdirs();
        return directory;

    }
    public String genHTML() throws Exception {
        String directory = path + siteName + "/index.html";
        String htmlContent = "<title> " + siteName + "</title\n<meta> " + author + " </meta>";
        File file = new File(directory);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(htmlContent);
        writer.close();
        return directory;


    }


}
