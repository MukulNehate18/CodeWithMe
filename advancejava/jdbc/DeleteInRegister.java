package advancejava.jdbc;
import java.sql.*;
import java.util.Scanner;

public class DeleteInRegister {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Connection con=DatabaseConnection.getConnection();
        try{
            System.out.println("Enter Gender which we want to delete: ");
            String gender=sc.next();
            PreparedStatement ps=con.prepareStatement("delete from register Where gender=?");
            ps.setString(1, gender);
            ps.executeUpdate();
            System.out.println("Data Deleted Successfully");
            Retrival.main(args);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
