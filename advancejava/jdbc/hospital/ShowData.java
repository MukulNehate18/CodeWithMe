package advancejava.jdbc.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ShowData {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","admin");
        PreparedStatement ps=co.prepareStatement("select * from patient");
        ResultSet rs=ps.executeQuery();
        while (rs.next()){
            System.out.println(rs.getInt("pid")+"\t"+rs.getString("name")+"\t" +
                    ""+rs.getString("address")+"\t"+rs.getString("gender")+"\t"+rs.getString("ward"));
        }
    }
}
