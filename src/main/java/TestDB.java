import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {
    public static void main(String[] args) {
        try
        {
            String url = "jdbc:mysql://localhost:3307/test";
            String user = "root";
            String password = "123456";

            // Load the Connector/J driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Establish connection to MySQL
            Connection conn = DriverManager.getConnection(url, user, password);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
