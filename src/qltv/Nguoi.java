/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qltv;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author a
 */
public class Nguoi {

    private String Hoten;
    private String NgaySinh;
    private String QueQuan;

    public Nguoi() {
    }

    public Nguoi(String Hoten, String NgaySinh, String QueQuan) {
        this.Hoten = Hoten;
        this.NgaySinh = NgaySinh;
        this.QueQuan = QueQuan;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

}
