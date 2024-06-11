package server;

import java.sql.*;

public class StudentServer {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/web_tech"; // Change it to your MySQL URL
        String username = "root"; // Change it to your MySQL username
        String password = "MyApp_90"; // Change it to your MySQL password
        
        // Establishing the connection
        try (Connection con = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to MySQL database.");
            
            // Creating a statement
            Statement statement = con.createStatement();
            
            // Executing the query
            String query = "SELECT * FROM student";
            ResultSet resultSet = statement.executeQuery(query);
            
            // Printing the results
            System.out.println("Student records:");
            while (resultSet.next()) {
                int id = resultSet.getInt("StudentId");
                String name = resultSet.getString("First_name");
                String address = resultSet.getString("address");
                System.out.println("ID: " + id + ", First_Name: " + name + ", Address: " + address);
            }
            
        } catch (SQLException e) {
            System.out.println("Connection failed. Error: " + e.getMessage());
        }
    }
}
