/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Vincent Smith
 */
package EX42;

public class Employee {

    private String Lname;
    private String Fname;
    private int Salary;

    public Employee(){
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }
    public void setLname(String Lname) {
        this.Lname = Lname;
    }
    public void setSalary(int Salary) {
        this.Salary = Salary;
    }
    public String getFname(){
        return Fname;
    }
    public String getLname(){
        return Lname;
    }
    public int getSalary(){
        return Salary;
    }
    public static void printHeader() {
        System.out.printf("%-10s %-10s %-10s", "Last ", "First ", "Salary");
        System.out.println();
        System.out.printf("%-10s%n", "----------------------------");
    }





}
