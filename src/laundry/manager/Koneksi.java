package laundry.manager;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Hariwa
 * 29/6/2024
 * 
 */

public class Koneksi {
    private static Connection connection;

    public static Connection getConnection(){
        JFrame frame = new JFrame();
        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundry_manager", "root", "");
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(frame,"Koneksi Error!","FATAL",JOptionPane.ERROR_MESSAGE);
        }
        return connection;
    }
}
