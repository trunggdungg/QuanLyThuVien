/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qltv;

/**
 *
 * @author ADMIN
 */
public class NgayMuonTra {
    private String NgayMuon;
    private int SoLuong;

    public NgayMuonTra(String NgayMuon, int SoLuong) {
        this.NgayMuon = NgayMuon;
        this.SoLuong = SoLuong;
    }

    public String getNgayMuon() {
        return NgayMuon;
    }

    public void setPhieuMuon(String NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
}
