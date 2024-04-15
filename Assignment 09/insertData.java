import java.sql.*;

class insertData{
    public static void main(String args[])
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");

            String[] insertData = {
                    "INSERT INTO student VALUES (1, 'Atul', 'Sangli', 'A', 90.50)",
                    "INSERT INTO student VALUES (2, 'Sangram', 'Sangli', 'B', 70.25)",
                    "INSERT INTO student VALUES (3, 'Satya', 'Mumbai', 'B', 61.36)",
                    "INSERT INTO student VALUES (4, 'Jaydeep', 'Pune', 'B', 60.95)",
                    "INSERT INTO student VALUES (5, 'Prashant', 'Sangli', 'C', 55.26)",
                    "INSERT INTO student VALUES (6, 'Abhi', 'Pune', 'C', 55.84)"
        };

        Statement stmt = conn.createStatement();

        for(String sql : insertData)
        {
            stmt.executeUpdate(sql);
        }

    System.out.println("Data inserted successfully..");
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
