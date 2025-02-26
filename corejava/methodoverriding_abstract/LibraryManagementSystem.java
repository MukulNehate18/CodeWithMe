package corejava.methodoverriding_abstract;

import java.util.Scanner;

//2. Library Management System 📚
//        - Abstract Class: Book (Fiction, NonFiction)
//   - Array of books with search, add, and list operations.
//   - Expected Output:
//        - List books, search by title, borrow books.
//### **2. Library Management System 📚**
//        #### **Operations**
//        - Add books to the library (Fiction, NonFiction).
//        - Display available books.
//- Search for a book by title.
//
//        #### **Expected Output Example**
//        ```
//Added: "The Alchemist" (Fiction)
//Added: "A Brief History of Time" (NonFiction)
//
//Library Books:
//        1. The Alchemist - Fiction
//2. A Brief History of Time - NonFiction
//
//Search Result: "The Alchemist" found in Fiction section.
abstract class Book{
    protected String[] b=new String[3];
    int count=0;
    abstract void addBook();
    abstract void borrowBook();
    public void displayBooks(){

    }
}
class Fiction extends Book{
    Scanner sc = new Scanner(System.in);

    @Override
    void addBook() {
        if (count <b.length){
            System.out.println("Enter book name: ");
            b[count]=sc.next();
            System.out.println("Book added successfully.");
            count++;
        }else{
            System.out.println("Library is full of books.");
        }
    }

    @Override
    void borrowBook() {
        if (count==0){
            System.out.println("No books available to borrow.");
        }else {
            System.out.println("Enter book name for borrow: ");
            String a= sc.next();
            boolean f= false;
            for (String s:b){
                if (a.equalsIgnoreCase(s)){
                    System.out.println(a+" book found.");
                    count--;
                    f=true;
                    break;
                }
            }
            if (!f){
                System.out.println("Book not found.");
            }
        }
    }
}
class NonFiction extends Book{
    Scanner sc = new Scanner(System.in);

    @Override
    void addBook() {
        if (count <b.length){
            System.out.println("Enter book name: ");
            b[count]=sc.next();
            System.out.println("Book added successfully.");
            count++;
        }else{
            System.out.println("Library is full of books.");
        }
    }

    @Override
    void borrowBook() {
        if (count==0){
            System.out.println("No books available to borrow.");
        }else {
            System.out.println("Enter book name for borrow: ");
            String a= sc.next();
            boolean f= false;
            for (String s:b){
                if (a.equalsIgnoreCase(s)){
                    System.out.println(a+" book found.");
                    count--;
                    f=true;
                    break;
                }
            }
            if (!f){
                System.out.println("Book not founf.");
            }
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Fiction f= new Fiction();
        f.addBook();
        f.borrowBook();

        NonFiction nf=new NonFiction();
        nf.borrowBook();
        nf.addBook();
    }
}
