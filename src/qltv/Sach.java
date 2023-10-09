/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qltv;


import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Sach {
    private int maSach;
    private String tenSach;
    private String TheLoai;
    private String TenTacGia;
    private int namXuatBan;

    public Sach() {
    }

    public Sach(int maSach, String tenSach, String TheLoai, String TenTacGia, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.TheLoai = TheLoai;
        this.TenTacGia = TenTacGia;
        this.namXuatBan = namXuatBan;
    }

    public Sach(int maSach, String tenSach, String TheLoai) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.TheLoai = TheLoai;
    }
    
    
    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String TheLoai) {
        this.TheLoai = TheLoai;
    }

    public String getTenTacGia() {
        return TenTacGia;
    }

    public void setTenTacGia(String TenTacGia) {
        this.TenTacGia = TenTacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

}
