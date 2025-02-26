package corejava.classandobject;
//2. Person Age Verification
//Task:
//Create a Person class with fields: name and age.
//In the main method:
//Create a Person object.
//Check if the person is eligible to vote (age >= 18) and print the result.
//Explanation:
//This demonstrates condition checking using instance variables.

import java.util.Scanner;

class Person{
    private int age;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class PersonAgeVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p[] = new Person[3];
        for (int i=0;i< p.length;i++){
            p[i]= new Person();
            System.out.print("Enter Name:");
            p[i].setName(sc.next());
            System.out.print("Enter Age:");
            p[i].setAge(sc.nextInt());
            if (p[i].getAge() >= 18) {
                System.out.println("Eligible to Vote.");
                System.out.println("Name: " + p[i].getName() + " Age:" + p[i].getAge()+"\n");
            } else {
                System.out.println("Not Eligible to Vote.");
                System.out.println("Name: " + p[i].getName() + " Age:" + p[i].getAge()+"\n");
            }
        }
    }
}
