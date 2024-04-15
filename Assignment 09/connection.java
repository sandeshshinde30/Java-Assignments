import java.sql.*;


class connection{
    public static void main(String args[])
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");

        // if(conn)
        // {
            System.out.println("connection Successfull");
        // }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
