/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import controler.ConnectionMySQL;
import qltv.NgayMuonTra;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class LopCon implements ThongKe {
    public List<NgayMuonTra> getListByNgayMuon()
    {
        Connection cons = ConnectionMySQL.getJDBCConnection();
        String sql = "select NgayMuon  , COUNT(*) as MaSinhVien from PhieuMuon group by NgayMuon";
        List<NgayMuonTra> list = new ArrayList<>();
        try {

            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                String NgayMuon = rs.getString("NgayMuon");
                int masv = rs.getInt("MaSinhVien");
               qltv.NgayMuonTra ngaymuon = new qltv.NgayMuonTra(NgayMuon,masv);
               list.add(ngaymuon);
            }
             ps.close();
            cons.close();
            return list;
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
