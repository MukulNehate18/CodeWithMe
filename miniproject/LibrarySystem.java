package miniproject;
import java.util.Scanner;

class Library  {
    private int accession_number,price_of_book;
    private String title_of_book,author_name;

    public void setAccession_number(int accession_number) {
        this.accession_number = accession_number;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public void setPrice_of_book(int price_of_book) {
        this.price_of_book = price_of_book;
    }

    public void setTitle_of_book(String title_of_book) {
        this.title_of_book = title_of_book;
    }

    public int getAccession_number() {
        return accession_number;
    }

    public int getPrice_of_book() {
        return price_of_book;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public String getTitle_of_book() {
        return title_of_book;
    }

}
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice;
        Library[] l= new Library[100];
        int count=0;

        do {
        System.out.println("\n" +
                "1. Add Book Details.\n" +
                "2. Display All Book Details.\n" +
                "3. Display List of all book of given author.\n" +
                "4. Display list the title of specified book.\n" +
                "5. Display list count of the book in the library.\n" +
                "6. Display list the books in the ascending order of accession number.\n" +
                "7. Update book details by title of book.\n" +
                "8. Delete book details by price.\n" +
                "9. Exit.\n \n");
        System.out.println("Enter your Choice: ");
        choice= sc.nextInt();
        switch (choice){
            case 1:
                if (count<l.length) {
                        l[count] = new Library();
                        System.out.print("Enter Accession Number:");
                        l[count].setAccession_number(sc.nextInt());
                        System.out.print("Enter Title Of Book:");
                        l[count].setTitle_of_book(sc.next());
                        System.out.print("Enter Author Name:");
                        l[count].setAuthor_name(sc.next());
                        System.out.print("Enter Price Of Book:");
                        l[count].setPrice_of_book(sc.nextInt());
                        count++;
                        System.out.println("Book added successfully!");
                }else {
                    System.out.println("Library is Full.");
                }
                break;

            case 2:
                if (count ==0){
                    System.out.println("No books are here!!");
                }else {
                    for (int i = 0; i < count; i++) {
                        System.out.println("Title of Book: "+l[i].getTitle_of_book()+" \nAccession Number: "
                                +l[i].getAccession_number()+" \nAuthor Name: "+l[i].getAuthor_name()+" \nPrice of Book: "
                                +l[i].getPrice_of_book());
                    }
                }
                break;

            case 3:
                System.out.print("Enter Author Name: ");
                sc.nextLine();
                String authorSearch = sc.nextLine();
                System.out.println("Books by " + authorSearch + ":");
                boolean found = false;
                for (int i = 0; i < count; i++) {
                    if (l[i].getAuthor_name().equalsIgnoreCase(authorSearch)) {
                        System.out.println(l[i].getTitle_of_book());
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("No books found by this author.");
                }
                break;

            case 4:
                System.out.println("Enter Title of Book: ");
                String y= sc.next();
                boolean fo = false;

                for (int i=0;i<count;i++){
                    if (l[i].getTitle_of_book().equalsIgnoreCase(y) ){
                        System.out.println("Title of Book: "+l[i].getTitle_of_book()+" Accession Number: "
                                +l[i].getAccession_number()+" Author Name: "+l[i].getAuthor_name()+" Price of Book: "
                                +l[i].getPrice_of_book());
                        fo=true;
                    }
                }
                if (!fo) {
                    System.out.println("No books found by this title.");
                }
                break;

            case 5:
                System.out.println("Count of Books are in Library is "+count);
                break;

            case 6:
                if (count > 1) {
                    System.out.println("Books sorted by Accession Number:");
                    for (int i = 0; i < count; i++) {
                        for (int j=i+1;j<count;j++) {
                            if (l[i].getAccession_number() >l[j].getAccession_number()){
                                Library temp =l[i];
                                l[i]=l[j];
                                l[j]= temp;
                            }
                        }
                    }
                    for (int i=0;i<count;i++){
                        System.out.println("Accession Number: " + l[i].getAccession_number() +
                                ", Title: " + l[i].getTitle_of_book() +
                                ", Author: " + l[i].getAuthor_name() +
                                ", Price: " + l[i].getPrice_of_book());
                    }
                } else {
                    System.out.println("Not enough books to sort.");
                }
                break;
            case 7:
                System.out.println("Enter title of book to update it's details:");
                String li= sc.next();
                boolean g=false;
                for (int i=0;i<count;i++){
                    if (l[i].getTitle_of_book().equalsIgnoreCase(li)){
                        System.out.print("Enter Accession Number:");
                        l[i].setAccession_number(sc.nextInt());
                        System.out.print("Enter Title Of Book:");
                        l[i].setTitle_of_book(sc.next());
                        System.out.print("Enter Author Name:");
                        l[i].setAuthor_name(sc.next());
                        System.out.print("Enter Price Of Book:");
                        l[i].setPrice_of_book(sc.nextInt());
                        count++;
                        System.out.println("Book updated successfully!");
                        g=true;
                    }
                }
                if (!g){
                    System.out.println("This book is not there in Library.");
                }
                break;
            case 8:
                if (count ==0){
                    System.out.println("Zero books are in Library.");
                    break;
                }
                System.out.println("Enter the price of book to delete:");
                int n= sc.nextInt();
                boolean b=false;
                for (int i=0;i<count;i++){
                    if (l[i].getPrice_of_book() ==n){
                        for (int j=i;j<count-i;j++){
                            l[j]=l[j+1];
                        }
                        count--;
                        l[count-1]=null;
                        b=true;
                        System.out.println("Book deleted Successfully!!");
                    }
                }
                if (!b) {
                    System.out.println("No book found with the given price.");
                }
                break;

            case 9:
                System.out.println("Thanks for visiting!!");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice!!");
        }
        }while(true);

    }
}
