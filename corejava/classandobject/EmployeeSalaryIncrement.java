package corejava.classandobject;

//1. Employee Salary Increment
//Task:
//Create an Employee class with fields: name, salary, and department.
//In the main method:
//Create an Employee object.
//Increase the employee's salary by 10% and print the updated salary.
//Explanation:
//This introduces instance variable manipulation and basic arithmetic operations.


import java.util.Scanner;

class Employee{
    private int salary;
    private String name, department;

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public int incrementSalary() {
        return ((salary*20)/100)+salary;
    }
}
public class EmployeeSalaryIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e= new Employee();
        System.out.print("Enter Name: ");
        e.setName(sc.next());
        System.out.print("Enter Salary: ");
        e.setSalary(sc.nextInt());
        System.out.print("Enter Department: ");
        e.setDepartment(sc.next());

        System.out.println("Name: "+e.getName()+" Department: "+ e.getDepartment()+" Salary: "+e.getSalary());
        System.out.println("After Salary Incremented by 20%");
        System.out.println("Name: "+e.getName()+" Department: "+ e.getDepartment()+" Salary: "+e.incrementSalary());


    }
}
