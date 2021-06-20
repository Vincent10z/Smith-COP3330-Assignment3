package EX42;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ex42Test {
    static ArrayList<String> lines = new ArrayList<String>();
    static int counter = 0;
    @Test
    void main() {
        ex42 app = new ex42();
        app.Read();
        app.Write();
        app.parseInput();
        app.Output();
    }

    @Test
    void read() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\COP 3330\\IntelliJProjects\\Smith-COP3330-Assignment3\\exercise42_input.txt"));
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

    @Test
    void write() {
        BufferedWriter writer = null;

        try {
            Collections.sort(lines);
            writer = new BufferedWriter(new FileWriter("C:\\COP 3330\\IntelliJProjects\\Smith-COP3330-Assignment3\\exercise42_Output.txt"));
            System.out.println("");
            for(String line : lines)
            {

                writer.write(line);
                writer.newLine();
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

    @Test
    void output() {
        System.out.println("Last     First     Salary");
        System.out.println("-------------------------");
        for(String line : lines)
        {
            System.out.println(line);
        }
    }

    @Test
    void parseInput() {
    }
}