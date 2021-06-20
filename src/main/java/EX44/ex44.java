/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Vincent Smith
 */
package EX44;
import java.io.File;
import java.util.List;

public class ex44 {
    public static void main(String[] args) throws Exception {
        genFile fCreator = new genFile();
        PSearch search = new PSearch();
        File file;
        file = fCreator.getFile("C:\\COP 3330\\IntelliJProjects\\Smith-COP3330-Assignment3" +
                "\\src\\main\\java\\EX44\\exercise44_input.json");
        if (file == null) {
            return;
        }
        List<Products> pList = JSON.jsonScan(file);
        System.out.print(search.printSearch(pList, search.search(pList)));
    }
}
