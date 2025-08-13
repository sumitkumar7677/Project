import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConn {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sakila?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "9914";

        try {

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");
            connection.close();
        }

        catch (SQLException e) {
            System.out.println("Database connection failed.");
            e.printStackTrace();
        }
    }
}
