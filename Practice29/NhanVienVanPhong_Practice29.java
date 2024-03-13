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
public class NhanVienVanPhong_Practice29 extends Pratice29 {
    private int soNgayLam;
    private int donGia = 100000;
    private int troCap ;

    public NhanVienVanPhong_Practice29( String hoTen, int namVaoLam,int soNgayLam, int troCap) {
        super(hoTen, namVaoLam);
        this.soNgayLam = soNgayLam;
        this.troCap = troCap;
    }
// Khong co tham so dau vao
    public NhanVienVanPhong_Practice29() {
        super();
    }
// Co tham so dau 
    @Override
    public void nhapThongTinNhanVien() {
        super.nhapThongTinNhanVien(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Scanner sc = new Scanner(System.in);
        System.out.print("input Ngay Lam: ");
        this.soNgayLam = sc.nextInt();
        System.out.print("Input Tro Cap: ");
        this.troCap = sc.nextInt();
    }

    @Override
    public long tinhLuongNhanVien() {
        return (this.luongCoban + this.soNgayLam * this.donGia + this.troCap); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return "NhanVienVanPhong_Practice29{" + "HoTen: " + hoTen + "Nam Vao Lam:  " + namVaoLam + "soNgayLam =" + soNgayLam + ", donGia =" + donGia + ", troCap =" + troCap + "Luong: " + this.tinhLuongNhanVien() +'}';
    }
    
  
}
