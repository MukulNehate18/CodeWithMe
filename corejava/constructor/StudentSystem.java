package corejava.constructor;
//2. Create a Student class
//Create a Student class with fields rollNo and marks.
//Use the default constructor to assign a default roll number (1) and marks (75).
//Add a method displayDetails() to print the student details.
//Explanation: This ensures a strong grasp of constructors and how instance variables can hold unique values per object.
class Student{
    private int rollNo, marks;
    public Student(){
        rollNo=1;
        marks=75;
    }
    public void displayDetails(){
        System.out.println("Roll no:"+rollNo+" marks:"+marks);
    }
}
public class StudentSystem {
    public static void main(String[] args) {
        Student s= new Student();
        s.displayDetails();
    }
}
