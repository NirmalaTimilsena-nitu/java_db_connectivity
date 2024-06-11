package server;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
    public static void main(String args[]) {
        try {
// Step 1: Load the Driver       
          //  Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
// Step 2: Get the connection by passing the URL        
            String url = "jdbc:mysql://localhost:3306/web_tech";
            Connection con = DriverManager.getConnection(url,"root","MyApp_90");
            System.out.println(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
