import java.sql.*;

class updateData{
    public static void main(String args[])
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");

            String sql = "UPDATE student SET city='Pune' WHERE city='sangli'";

        Statement stmt = conn.createStatement();

        
            stmt.executeUpdate(sql);
        

    System.out.println("Data updated successfully..");
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
