package advancejava.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertUsingForLoop {
    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(System.in);
        Connection con=DatabaseConnection.getConnection();
        PreparedStatement ps;
        System.out.println("Enter Number of data to enter:");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Roll No:");
            int id=sc.nextInt();
            System.out.println("Enter Name:");
            String name=sc.next();

            ps=con.prepareStatement("insert into data values(?, ?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.executeUpdate();
        }

    }
}
