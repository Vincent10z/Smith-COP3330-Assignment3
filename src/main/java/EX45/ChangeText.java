package EX45;

import java.io.*;
import java.util.Scanner;

public class ChangeText {
    static String fileName;
    public static void UserOutputFile() {
        Scanner input = new Scanner(System.in);
        System.out.print("What would you like the name of the output file to be? ");
        fileName = input.nextLine();

    }

    public static void Changeinfo() {
        try {
            File file = new File("C:\\COP 3330\\IntelliJProjects\\Smith-COP3330-Assignment3" +
                    "\\src\\main\\java\\EX45\\exercise45_input.txt");

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "use", oldtext = "utilize";
            while ((line = reader.readLine()) != null) {
                oldtext += line + "\r\n";
            }
            reader.close();
            String replacedtext = oldtext.replaceAll("utilize", "use");

            FileWriter writer = new FileWriter("C:\\COP 3330\\IntelliJProjects\\Smith-COP3330-Assignment3" +
                    "\\src\\main\\java\\EX45\\" + fileName);

            writer.write(replacedtext);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
