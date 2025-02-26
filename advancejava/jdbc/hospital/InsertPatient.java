package advancejava.jdbc.hospital;
import java.sql.*;
import java.util.Scanner;

public class InsertPatient {
    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of data: ");
        int n=sc.nextInt();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "admin");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Id: ");
            int id=sc.nextInt();
            System.out.println("Enter Name: ");
            String  name=sc.next();
            System.out.println("Enter Address: ");
            String address=sc.next();
            System.out.println("Enter Gender: ");
            String gender=sc.next();
            PreparedStatement ps = con.prepareStatement("insert into patient values(?,?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, address);
            ps.setString(4, gender);
            ps.executeUpdate();
        }
        System.out.println("Data stored successfully!!!");
    }
}
