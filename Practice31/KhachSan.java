/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice31;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class KhachSan extends CompanyABC {
    private int soSao;

    public KhachSan() {
    }

    public KhachSan(int soSao) {
        this.soSao = soSao;
    }

    public KhachSan(int soSao, int maSo, int height, int width, int phuongThucGiaTri) {
        super(maSo, height, width, phuongThucGiaTri);
        this.soSao = soSao;
    }

    @Override
    public void nhapThongTinCuaDoiTuong() {
        super.nhapThongTinCuaDoiTuong(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Scanner sc = new Scanner(System.in);
        System.out.print("input So Sao: ");
        this.soSao = sc.nextInt();
    }

    @Override
    public long DienTich() {
        return ( (this.height * (this.width * 5000)) * 100000 + this.soSao * 50000); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return "KhachSan{" + 
                "Chieu Rong: " + width +
                "Chieu Dai: " + height +
                "soSao=" + soSao + 
                "Gia Ban: " + this.DienTich() +'}';
    }
    
    
}
