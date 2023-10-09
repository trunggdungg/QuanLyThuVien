/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import qltv.NgayMuonTra;
import DAO.ThongKe;
import DAO.LopCon;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ThongKeCon implements ThongKeService {
    private ThongKe thongke = null;
  public ThongKeCon ()
  {
      this.thongke = new LopCon();
  }
    @Override
    public List<NgayMuonTra> getListByNgayMuon()
    {
        return thongke.getListByNgayMuon();
    }
    
}
