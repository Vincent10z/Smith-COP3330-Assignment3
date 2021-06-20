package EX41;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class ex41 {
    static ArrayList<String> lines = new ArrayList<>();
    static int counter = 0;

    public static void main(String[] args){
        ex41 app = new ex41();
        app.Read();
        app.Write();
        app.Output();
    }
    public void Read(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("C:\\COP 3330\\IntelliJProjects\\" +
                    "Smith-COP3330-Assignment3\\src\\main\\java\\EX41\\exercise41_input.txt"));
            String currentline = reader.readLine();
            while (currentline != null)
            {
                lines.add(currentline);
                currentline = reader.readLine();
                if (currentline == null){
                    break;
                }
                System.out.println(currentline);
            }
            Collections.sort(lines);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        }

    public void Write(){
        BufferedWriter writer;
         counter = 0;

        try {
            Collections.sort(lines);
            writer = new BufferedWriter(new FileWriter("C:\\COP 3330\\IntelliJProjects" +
                    "\\Smith-COP3330-Assignment3\\src\\main\\java\\EX41\\exercise41_Output.txt"));
            System.out.println("");
            for(String line : lines)
            {
                writer.write(line);
                writer.newLine();
                counter++;
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void Output()
    {
        System.out.println("Total of " +counter+ " names");
        System.out.println("-----------------");
        for(String line : lines)
        {
            System.out.println(line);
        }
    }
}
