import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbConn {
    public static void main(String[] args) {
        // Updated JDBC URL with SSL disabled and public key retrieval allowed
        String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "root";
        String password = "9914";

        try {
            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to MySQL!");

            // Execute a simple query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT NOW()");
            if (rs.next()) {
                System.out.println("Current DB Time: " + rs.getString(1));
            }

            // Close connection
            conn.close();
            System.out.println("✅ Connection closed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
