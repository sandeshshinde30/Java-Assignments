import java.sql.*;

class createTable
{
   public static void main(String args[])
   {
     try{
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");

    Statement stmt = conn.createStatement();

    String sql = "CREATE TABLE IF NOT EXISTS student("
                + "Roll_No INT PRIMARY KEY,"
                + "Name VARCHAR(255),"
                + "City VARCHAR(255),"
                + "GRADE CHAR(1),"
                +  "Marks DECIMAL(10,3)"
                + ")";

        stmt.executeUpdate(sql);

       System.out.println("Table Created successfully."); 
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
   }

}