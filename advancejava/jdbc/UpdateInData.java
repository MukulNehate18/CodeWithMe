package advancejava.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateInData {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Connection con=DatabaseConnection.getConnection();
        try {
            System.out.print("Enter a Name which want to set: ");
            String name=sc.next();
            System.out.print("Enter roll number: ");
            int roll=sc.nextInt();

            PreparedStatement ps = con.prepareStatement("Update data SET name= ? where roll=?");

            ps.setString(1, name);
            ps.setInt(2, roll);
            ps.executeUpdate();
            System.out.println("Data Updated Successfully.");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
