import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBCTest{
public static void main(String[]args){

    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","0000");
        String insertSQL="REPLACE INTO students VALUES(?,?)";
        PreparedStatement pstmt=con.prepareStatement(insertSQL);
        Object[][]students={
            {1,"Alice"},
            {2,"Bob"},
            {3,"Sreedhar"},
            {4,"Shiva"},
            {5,"David"},
            {6,"Puneeth"}
        };
        for(Object[] student:students){
            pstmt.setInt(1,(int) student[0]);
            pstmt.setString(2,(String) student[1] );
            pstmt.executeUpdate();
        }
        Statement stmt =con.createStatement();
        Result rs=stmt.executeQuery("Select * from students");
        System.out.println(rs.getInt("id")+"  "+rs.getString("name"));
    con.close();

    }
    catch(Exception e){
        e.printStackTrace();
    }
}
}