/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Vincent Smith
 */

package EX46;

import java.io.*;

public class ex46 {
    public static void main(String[] args) throws IOException {
        ShowWord showWord = new ShowWord(new File("C:\\COP 3330\\IntelliJProjects\\" +
                "Smith-COP3330-Assignment3\\src\\main\\java\\EX46\\exercise46_input.txt"));

        showWord.wordCount("badger");
        showWord.wordCount("mushroom");
        showWord.wordCount("snake");
    }
}

