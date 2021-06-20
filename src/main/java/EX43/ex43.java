/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Vincent Smith
 */
package EX43;

import java.util.Scanner;

public class ex43 {
    static public void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        String sName;
        String author;
        String getJS;
        String getCss;


        System.out.println("Site name: ");
        sName = userInput.nextLine();
        System.out.println("Author: ");
        author = userInput.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        getJS = userInput.nextLine();
        System.out.print("Do you want a folder for CSS? ");
        getCss = userInput.nextLine();

        webGen newSite = new webGen();

        newSite.siteName = sName;
        newSite.author = author;
        newSite.path = "src/main/java/ex43/";

        System.out.println("Created " + newSite.makeWeb());
        System.out.println("Created " + newSite.genHTML());

        if(getJS.equals("y"))
            System.out.println("Created " + newSite.genJSFolder());
        if (getCss.equals("Y"))
            System.out.println("Created " + newSite.genCSSFolder());
    }
}
