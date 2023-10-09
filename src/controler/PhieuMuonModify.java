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
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qltv.PhieuMuon;

/**
 *
 * @author a
 */
public class PhieuMuonModify {

    public static List<PhieuMuon> findAll() {
        List<PhieuMuon> PhieuMuonList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;

        try {
            //lay tat ca danh sach pm
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "root");

            //query
            String sql = "select * from PhieuMuon";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                
                int madg = resultSet.getInt("MaSinhVien");
                int MASach = resultSet.getInt("MaSach");
                String tensach = resultSet.getString("TenSach");
                String theloai = resultSet.getString("TheLoai");
                Date ngaymuon = resultSet.getDate("NgayMuon");
                Date ngaytra = resultSet.getDate("NgayPhaiTra");
                String htrang = resultSet.getString("HienTrang");

                PhieuMuon pm = new PhieuMuon(madg, MASach, tensach, theloai, ngaymuon, ngaytra, htrang);

                PhieuMuonList.add(pm);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PhieuMuonModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();

                } catch (SQLException ex) {
                    Logger.getLogger(PhieuMuonModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();

                } catch (SQLException ex) {
                    Logger.getLogger(PhieuMuonModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return PhieuMuonList;
    }

    public static void insert(PhieuMuon pm) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "root");

            //query
            String sql = "insert into PhieuMuon( MaSinhVien, MaSach, TenSach,TheLoai,NgayMuon,NgayPhaiTra,HienTrang) values(?, ?, ?, ?, ?, ?,? )";
            statement = connection.prepareCall(sql);
          
            statement.setInt(1, pm.getMaDocGia());
            statement.setInt(2, pm.getMaSach());
            statement.setString(3, pm.getTenSach());
            statement.setString(4, pm.getTheLoai());
            statement.setDate(5, (java.sql.Date) pm.getNgayMuon());
            statement.setDate(6, (java.sql.Date) pm.getNgayTra());
            statement.setString(7, pm.getHienTrang());

            statement.execute();

            
        } catch (SQLException ex) {
            Logger.getLogger(PhieuMuonModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();

                } catch (SQLException ex) {
                    Logger.getLogger(PhieuMuonModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();

                } catch (SQLException ex) {
                    Logger.getLogger(PhieuMuonModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static void update(PhieuMuon pm) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "");

            //query
            String sql = "update PhieuMuon set MaSinhVien=?,MaSach=?,TenSach=?,TheLoai=?,NgayMuon=?,NgayPhaiTra=?,HienTrang=?";
            statement = connection.prepareCall(sql);

            //    statement.setInt(1, pm.getMaPhieuMuon());
            statement.setInt(1, pm.getMaDocGia());
            statement.setInt(2, pm.getMaSach());
            statement.setString(3, pm.getTenSach());
            statement.setString(4, pm.getTheLoai());
            statement.setDate(5, (java.sql.Date) pm.getNgayMuon());
            statement.setDate(6, (java.sql.Date) pm.getNgayTra());
            statement.setString(7, pm.getHienTrang());
            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(PhieuMuonModify.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();

                } catch (SQLException ex) {
                    Logger.getLogger(PhieuMuonModify.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();

                } catch (SQLException ex) {
                    Logger.getLogger(PhieuMuonModify.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static void delete(int MaDocGia) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "root");

            //query
            String sql = "delete from PhieuMuon where MaSinhVien = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, MaDocGia);

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(PhieuMuonModify.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();

                } catch (SQLException ex) {
                    Logger.getLogger(PhieuMuonModify.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();

                } catch (SQLException ex) {
                    Logger.getLogger(PhieuMuonModify.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static List<PhieuMuon> findByFullname(String fullname) {
        List<PhieuMuon> PhieuMuonList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlythuvien", "root", "root");

            //query
            String sql = "select * from PhieuMuon where MaSach like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + fullname + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // int maPm = resultSet.getInt("MaPhieuMuon");
                int madg = resultSet.getInt("MaSinhVien");
                int MASach = resultSet.getInt("MaSach");
                String tensach = resultSet.getString("TenSach");
                String theloai = resultSet.getString("TheLoai");
                Date ngaymuon = resultSet.getDate("NgayMuon");
                Date ngaytra = resultSet.getDate("NgayPhaiTra");
                String htrang = resultSet.getString("HienTrang");
                PhieuMuon pm = new PhieuMuon(madg, MASach, tensach, theloai, ngaymuon, ngaytra, htrang);
                PhieuMuonList.add(pm);

            }
        } catch (SQLException ex) {
            Logger.getLogger(PhieuMuonModify.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();

                } catch (SQLException ex) {
                    Logger.getLogger(PhieuMuonModify.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();

                } catch (SQLException ex) {
                    Logger.getLogger(PhieuMuonModify.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return PhieuMuonList;
    }

}
