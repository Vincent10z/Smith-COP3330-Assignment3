import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class ex41 {
    ArrayList<String> lines = new ArrayList<String>();
    int counter = 0;

    public static void main(String[] args){
        ex41 app = new ex41();
        app.Read();
        app.Write();
        app.Output();
    }
    public void Read(){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\COP 3330\\IntelliJProjects\\Smith-COP3330-Assignment3\\exercise41_input.txt"));
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
        finally {
            try {
                if (reader != null)
                {
                    reader.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
    public void Write(){
        BufferedWriter writer = null;
         counter = 0;

        try {
            Collections.sort(lines);
            writer = new BufferedWriter(new FileWriter("C:\\COP 3330\\IntelliJProjects\\Smith-COP3330-Assignment3\\exercise41_Output.txt"));
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
        finally {
            try {
                if (writer != null)
                {
                    writer.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
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
