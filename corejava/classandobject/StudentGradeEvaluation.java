package corejava.classandobject;
//3. Student Grade Evaluation
//Task:
//Create a Student class with fields: name, marks, and subject.
//In the main method:
//Create a Student object.
//Check if the student has passed or failed the subject (passing marks >= 40) and print the result.
//Explanation:
//This task involves condition checking and field manipulation.

import java.util.Scanner;

class Studednt{
    private int marks;
    private String name, subject;

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String getSubject() {
        return subject;
    }
}
public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Studednt s[]= new Studednt[3];
        for (int i=0;i< s.length;i++){
            s[i]= new Studednt();
            System.out.print("Enter Name: ");
            s[i].setName(sc.next());
            System.out.print("Enter Marks: ");
            s[i].setMarks(sc.nextInt());
            System.out.print("Enter Subject: ");
            s[i].setSubject(sc.next());
        }
        for (int i=0;i<s.length;i++){
            if (s[i].getMarks()>=40){
                System.out.println(s[i].getName()+" is Passed in "+s[i].getSubject()+" i.e. "+s[i].getMarks()+" marks.");
            }else {
                System.out.println(s[i].getName()+" is Failed in "+s[i].getSubject()+" i.e. "+s[i].getMarks()+" marks.");
            }
        }
    }
}
