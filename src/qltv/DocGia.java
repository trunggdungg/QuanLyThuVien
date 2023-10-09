/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qltv;

import java.util.Scanner;

/**
 *
 * @author a
 */
public class DocGia extends Nguoi {

    private int maDocGia;

    public DocGia() {

    }

    public DocGia(int maDocGia, String Hoten, String NgaySinh, String QueQuan) {
        super(Hoten, NgaySinh, QueQuan);
        this.maDocGia = maDocGia;
    }

    public int getMaDocGia() {
        return maDocGia;
    }

    public void setMaDocGia(int maDocGia) {
        this.maDocGia = maDocGia;
    }

  
}
