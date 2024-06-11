 package server;

import java.sql.*;

public class ReadingData {
	static Connection con = null;
	static Statement stmt = null;
	static ResultSet rs = null;

	public static void main(String args[]) throws Exception {
		readData();
	}

	private static void readData() throws Exception {
		// Create the SQL
		String sql = "SELECT * FROM CUSTOMERS";
		// Get the connection using our utils.
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/web_tech";
		Connection con = DriverManager.getConnection(url, "root", "MyApp_90");
		if (con != null) {
			// Create statement from connection
			stmt = con.createStatement();
			// Execute the statement by passing the sql.
			rs = stmt.executeQuery(sql);
			// Iterate over all the returned records
			while (rs.next()) {
				String firstName = rs.getString(1);
				String middleName = rs.getString(2);
				String lastName = rs.getString(3);
				int age = rs.getInt(4);
				String city = rs.getString(5);
				String state = rs.getString(6);
				String country = rs.getString(7);
				System.out.println(firstName + " ," + middleName + " ," + lastName + " ," 
				+ age + " ,"+ city + " ," + state + " ," + country);
			} // End of While
		} else {
			System.out.println("Unable to get the connection");
		}
	}
}
   