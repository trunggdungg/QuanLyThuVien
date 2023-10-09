/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qltv.DocGia;
import qltv.TKMK;

/**
 *
 * @author ADMIN
 */
public class DangKyControler {
    public static List<TKMK> findAll() {
        List<TKMK> TKMKList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "root");
            
            //query
            String sql = "select * from TKMK";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
             
            String TK = resultSet.getString("user");
            String MK = resultSet.getString("password");
            TKMK tk = new TKMK(TK, MK);
                TKMKList.add(tk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DangKyControler.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DangKyControler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DangKyControler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return TKMKList;
    }
    
    
     public static void insert(TKMK tk) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "root");
            
            //query
            String sql = "insert into TKMK(user, password) values(?, ?)";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, tk.getTK());
            statement.setString(2, tk.getMK());

            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DangKyControler.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DangKyControler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DangKyControler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
}
