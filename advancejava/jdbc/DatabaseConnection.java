package advancejava.jdbc;
import java.sql.*;
public class DatabaseConnection {
    private static Connection con = null;
    public static Connection getConnection() {
        if(con == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcexample", "root", "admin");
                System.out.println("Database Connected Successfully.");
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }else{
            return con;
        }
        return con;
    }
}
