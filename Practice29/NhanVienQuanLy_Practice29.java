/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice29;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class NhanVienQuanLy_Practice29 extends Pratice29{
    private float heSoChucVu;
    private long Thuong;

    public NhanVienQuanLy_Practice29(long Thuong, String hoTen, int namVaoLam,float heSoChucVu) {
        super(hoTen, namVaoLam);
        this.heSoChucVu = heSoChucVu;
        this.Thuong = Thuong;
    }

    public NhanVienQuanLy_Practice29() {
        super();
    }

    @Override
    public void nhapThongTinNhanVien() {
        super.nhapThongTinNhanVien(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
         Scanner sc = new Scanner(System.in);
        System.out.print("input He So Chuc Vu: ");
        this.heSoChucVu = sc.nextFloat();
        System.out.print("Input Thuong : ");
        this.Thuong = sc.nextLong();
    }

    @Override
    public long tinhLuongNhanVien() {
        return (long)(this.luongCoban * this.heSoChucVu + this.Thuong); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return "NhanVienQuanLy_Practice29{" + "HoTen: " + hoTen 
                                        + "Nam Vao Lam:  " + namVaoLam
                                        + "heSoChucVu: " + heSoChucVu + 
                                        ", Thuong: " + Thuong + '}';
    }
    
}
