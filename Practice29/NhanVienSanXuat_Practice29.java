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
public class NhanVienSanXuat_Practice29 extends Pratice29{
    private int soSanPham;
    private int donGia = 2000;
// Khong co tham so dau vao
    public NhanVienSanXuat_Practice29() {
        super();
    }
// Co tham so dau vao
    public NhanVienSanXuat_Practice29( String hoTen, int namVaoLam, int soSanPham) {
        super(hoTen, namVaoLam);
        this.soSanPham = soSanPham;
    }

    @Override
    public void nhapThongTinNhanVien() {
        super.nhapThongTinNhanVien(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Scanner sc = new Scanner(System.in);
        System.out.print("input Ngay Lam: ");
        this.soSanPham = sc.nextInt();
    }

    @Override
    public long tinhLuongNhanVien() {
        return(this.luongCoban + this.soSanPham * this.donGia); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return "NhanVienSanXuat_Practice29{" +  "HoTen: " + hoTen 
                                        + "Nam Vao Lam:  " + namVaoLam
                                        + "soSanPham: " + soSanPham 
                                        + ", donGia: " + donGia 
                                        + " Luong:  " + this.tinhLuongNhanVien()+ '}';
    }

  
    
}
