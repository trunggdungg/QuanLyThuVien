/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qltv;

import controler.ConnectionMySQL;
import static controler.ConnectionMySQL.getJDBCConnection;
import form.DangNhap;
import java.sql.*;
/**
 *
 * @author ADMIN
 */
public class QLTV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
java.sql.Connection connection = getJDBCConnection();

        if (connection != null) {
            System.out.println("Data connection successful");
            DangNhap dn = new DangNhap();
            dn.show();
        } else {
            System.out.println("Data connection failed");
        }
    }
    
    

    }
    

