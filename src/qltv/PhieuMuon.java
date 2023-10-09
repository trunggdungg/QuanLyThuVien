/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qltv;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class PhieuMuon extends Sach {

    private int MaDocGia;
    private Date NgayMuon;
    private Date NgayTra;
    private String HienTrang;

    public PhieuMuon() {
    }

    public PhieuMuon(int MaDocGia, int maSach, String tenSach, String TheLoai, Date NgayMuon, Date NgayTra, String HienTrang) {
        super(maSach, tenSach, TheLoai);

        this.MaDocGia = MaDocGia;
        this.NgayMuon = NgayMuon;
        this.NgayTra = NgayTra;
        this.HienTrang = HienTrang;
    }

    public Date getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(Date NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public int getMaDocGia() {
        return MaDocGia;
    }

    public void setMaDocGia(int MaDocGia) {
        this.MaDocGia = MaDocGia;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }

    public String getHienTrang() {
        return HienTrang;
    }

    public void setHienTrang(String HienTrang) {
        this.HienTrang = HienTrang;
    }

}
