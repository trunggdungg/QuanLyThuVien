/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class ConnectionMySQL {

    public static Connection getJDBCConnection() {
        String url = "jdbc:mysql://localhost:3306/quanlythuvien";
        String user = "root";
        String password = "root";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

}
