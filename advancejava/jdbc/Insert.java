package advancejava.jdbc;
import java.sql.*;

public class Insert {
    public static void main(String[] args) throws Exception{
        Connection con=DatabaseConnection.getConnection();
        PreparedStatement ps=con.prepareStatement("insert into data values (1, 'mukul');");
        ps.executeUpdate();
    }
}