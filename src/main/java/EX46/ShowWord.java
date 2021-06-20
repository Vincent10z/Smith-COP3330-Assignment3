package EX46;

import java.io.File;
import java.io.IOException;

public class ShowWord {

    private final Wordinput wordinput;

    public ShowWord(File inputFile) throws IOException {
        wordinput = new Wordinput(inputFile);
    }

    public void wordCount(String word) {
        WordNum wordCounts = wordinput.getWordCounts(word);
        System.out.print(word + ": ");
        for(int x = 0; x < wordCounts.getCount(x); x++ ) {
           System.out.print("*");
       }
        System.out.println();
    }

}