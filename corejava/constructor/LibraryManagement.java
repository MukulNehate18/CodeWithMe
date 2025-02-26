package corejava.constructor;
//4. Library Management
//Create a Library class to store the name and numberOfBooks of a library.
// Add a method to issue a book (reduce the count by 1) and another to return a book
// (increase the count by 1).
//Explanation: Focus on managing the count correctly through method calls and validate against negative counts.
class Library {
    private int noOfBook=6;
    private String name;
    public int issueBook(){
        noOfBook--;
        return noOfBook;
    }
    public int returnBook(){
        noOfBook++;
        return noOfBook;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Library l = new Library();
        System.out.println("Number of Book when Issued a book is "+l.issueBook());
        System.out.println("Number of Book when Issued a book is "+l.returnBook());

    }
}
