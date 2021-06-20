package EX46;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Wordinput {

    private Reader reader;

    public Wordinput(File file) throws IOException {
        reader = new Reader(file);
    }

    public WordNum getWordCounts(String inputWord) {
        String[] extractWords = reader.extractWords();
        int totalCount = (int) Arrays.stream(extractWords).filter(inputWord::equals).count();

        return new WordNum(inputWord, totalCount);

    }

}