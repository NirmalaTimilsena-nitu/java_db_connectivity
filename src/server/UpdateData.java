package server;

import java.sql.*;
import javax.swing.JOptionPane;

public class UpdateData {
   static Connection con = null;
    static Statement stmt = null;
    static ResultSet rs = null;
    public static void main(String args[]) throws Exception {
        RecordUpdate();
    }

    private static void RecordUpdate() throws Exception {
        String sql = "UPDATE customers SET firstname = 'Bini' where age=20";
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/web_tech";
        con = DriverManager.getConnection(url, "root", "MyApp_90");
        if (con != null) {
            stmt = con.createStatement();
            int result=stmt.executeUpdate(sql);
            if(result ==1){
            	//System.out.println("Update Record Successfully");
               JOptionPane.showMessageDialog(null, "Update record Successfully");
            }else{
                JOptionPane.showMessageDialog(null, "Failed to update record ");
            }
            
        } else {
            System.out.println("Unable to get the connection");
        }
    }
}
