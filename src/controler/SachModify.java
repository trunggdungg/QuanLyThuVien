/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;
import qltv.Sach;
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

public class SachModify {
     public static List<Sach> findAll() {
        List<Sach> SachList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
            //lay tat ca danh sach sach
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "root");
            
            //query
            String sql = "select * from Sach";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                int masach = resultSet.getInt("MaSach");
            String tensach = resultSet.getString("TenSach");
            String theloai = resultSet.getString("TheLoai");
            String tentg = resultSet.getString("TenTacGia");
            int namxb = resultSet.getInt("NamXuatBan");
            
            Sach sach = new Sach(masach, tensach, theloai, tentg,namxb);
                SachList.add(sach);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return SachList;
    }
    
    public static void insert(Sach sach) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sach
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "root");
            
            //query
            String sql = "insert into Sach(MaSach, TenSach, TheLoai, TenTacGia,NamXuatBan) values(?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, sach.getMaSach());
            statement.setString(2, sach.getTenSach());
            statement.setString(3, sach.getTheLoai());
            statement.setString(4, sach.getTenTacGia());
            statement.setInt(5, sach.getNamXuatBan());

            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    
    public static void update(Sach sach) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "");
            
            //query
            String sql = "update Sach set MaSach=?,TenSach=?,TheLoai=?,TenTacGia=?,NamXuatBan=?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, sach.getMaSach());
            statement.setString(2, sach.getTenSach());
            statement.setString(3, sach.getTheLoai());
            statement.setString(4, sach.getTenTacGia());
            statement.setInt(5, sach.getNamXuatBan());

            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    
    public static void delete(int MaSach) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "root");
            
            //query
            String sql = "delete from Sach where MaSach = ?";
            statement = connection.prepareCall(sql);
            
            statement.setInt(1, MaSach);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    
    public static List<Sach> findByFullname(String fullname) {
        List<Sach> SachList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "root");
            
            //query
            String sql = "select * from Sach where TenSach like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+fullname+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
             int masach = resultSet.getInt("MaSach");
            String tensach = resultSet.getString("TenSach");
            String theloai = resultSet.getString("TheLoai");
            String tentg = resultSet.getString("TenTacGia");
            int namxb = resultSet.getInt("NamXuatBan");
            Sach sach = new Sach(masach, tensach, theloai, tentg,namxb);
                SachList.add(sach);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return SachList;
    }
    
}
