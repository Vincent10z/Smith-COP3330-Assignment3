/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Vincent Smith
 */
package EX42;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ex42 {
    public static ArrayList<Employee> empList = new ArrayList<>();

    public void getInfo() {
        try {
            File file = new File("C:\\COP 3330\\IntelliJProjects\\Smith-COP3330-Assignment3\\" +
                    "src\\main\\java\\EX42\\exercise42_input.txt");
            if (file.exists()) {
                Scanner inFile = new Scanner(file);
                while (inFile.hasNext()) {
                    String line = inFile.next();
                    if (line.length() > 0) {
                        String coms = ",";
                        String[] tokens = line.split(coms);
                        Employee emp = new Employee();
                        emp.setSalary(Integer.parseInt(tokens[2]));
                        emp.setFname(tokens[1]);
                        emp.setLname(tokens[0]);
                        empList.add(emp);
                    }
                }
                inFile.close();
            } else {
                System.out.println("File Not Found");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception");
        }
    }

    public void setInfo() {
        for (Employee employee : empList) {
            System.out.printf("%-10s %-10s %-10s%n", employee.getLname(), employee.getFname(), employee.getSalary());
        }
    }

    public void writeInfo() {
        File Output = new File("C:\\COP 3330\\IntelliJProjects\\Smith-COP3330-Assignment3\\src" +
                "\\main\\java\\EX42\\exercise42_output.txt");
        try {
            PrintWriter Out = new PrintWriter(Output);
            Out.println(String.format("%-10s %-10s %-10s", "Last ", "First ", "Salary"));
            Out.print(String.format("%-10s%n", "----------------------------"));
            for (Employee employee : empList) {
                Out.print(String.format("%-10s %-10s %-10s%n", employee.getLname(), employee.getFname(),
                        employee.getSalary()));
            }
            Out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        ex42 App = new ex42();
        App.getInfo();
        App.writeInfo();
        Employee.printHeader();
        App.setInfo();

    }


}










