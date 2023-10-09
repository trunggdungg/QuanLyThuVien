/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;



/**
 *
 * @author ADMIN
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import qltv.DocGia;
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

/**
 * CRUD (insert, update, delete, findAll)
 * @author Diep.Tran
 */
public class StudentModify {
    public static List<DocGia> findAll() {
        List<DocGia> DocGiaList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "root");
            
            //query
            String sql = "select * from docgia";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                int maDocGia = resultSet.getInt("madocgia");
            String HoTen = resultSet.getString("hoten");
            String NgaySinh = resultSet.getString("ngaysinh");
            String QueQuan = resultSet.getString("diachi");
            DocGia DG = new DocGia(maDocGia, HoTen, NgaySinh, QueQuan);
                DocGiaList.add(DG);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return DocGiaList;
    }
    
    public static void insert(DocGia DG) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "root");
            
            //query
            String sql = "insert into docgia(madocgia, hoten, ngaysinh, diachi) values(?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, DG.getMaDocGia());
            statement.setString(2, DG.getHoten());
            statement.setString(3, DG.getNgaySinh());
            statement.setString(4, DG.getQueQuan());

            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    
    public static void update(DocGia DG) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "");
            
            //query
            String sql = "update docgia set madocgia=?,hoten=?,ngaysinh=?,diachi=?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, DG.getMaDocGia());
            statement.setString(2, DG.getHoten());
            statement.setString(3, DG.getNgaySinh());
            statement.setString(4, DG.getQueQuan());

            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    
    public static void delete(int madocgia) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "root");
            
            //query
            String sql = "delete from docgia where madocgia = ?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, madocgia);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    
    public static List<DocGia> findByFullname(String fullname) {
        List<DocGia> DocGiaList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "root");
            
            //query
            String sql = "select * from docgia where hoten like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+fullname+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
             int maDocGia = resultSet.getInt("madocgia");
            String HoTen = resultSet.getString("hoten");
            String NgaySinh = resultSet.getString("ngaysinh");
            String QueQuan = resultSet.getString("diachi");
            DocGia DG = new DocGia(maDocGia, HoTen, NgaySinh, QueQuan);
                DocGiaList.add(DG);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return DocGiaList;
    }
}

