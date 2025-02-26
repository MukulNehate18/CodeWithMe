package advancejava.jdbc.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateWard {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","admin");

        PreparedStatement ps=con.prepareStatement("alter table patient add ward varchar(78)");
        ps.executeUpdate();
        System.out.println("Ward added in database.");
    }
}
