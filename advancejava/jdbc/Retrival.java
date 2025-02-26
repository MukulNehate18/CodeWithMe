package advancejava.jdbc;
import java.sql.*;
public class Retrival {
    public static void main(String[] args) throws Exception {
        Connection co=DatabaseConnection.getConnection();

        PreparedStatement ps1= co.prepareStatement("select * from register");
        ResultSet rs= ps1.executeQuery();

        while (rs.next()){
            String name1=rs.getString("name");
            System.out.println("Name : "+name1);

            String email1=rs.getString("email");
            System.out.println("Email : "+email1);

            String pass1=rs.getString("password");
            System.out.println("Password : "+pass1);

            String gender1=rs.getString("gender");
            System.out.println("Gender : "+gender1);

            String city1=rs.getString("city");
            System.out.println("City : "+city1);

            System.out.println("----------------------------------------------------------------");
        }
    }
}
