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
public class NhaVaSoLau extends CompanyABC{
    private int solau;

    public NhaVaSoLau() {
    }

    public NhaVaSoLau(int solau) {
        this.solau = solau;
    }

    public NhaVaSoLau(int solau, int maSo, int height, int width, int phuongThucGiaTri) {
        super(maSo, height, width, phuongThucGiaTri);
        this.solau = solau;
    }

    @Override
    public void nhapThongTinCuaDoiTuong() {
        super.nhapThongTinCuaDoiTuong(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Scanner sc = new Scanner(System.in);
        System.out.print("Input So Lau: ");
        this.solau = sc.nextInt();
    }

    @Override
    public long DienTich() {
        return ((this.width * this.height) * 10000 + this.solau * 100000); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return "NhaVaSoLau{" + 
                "So lau: " + solau +
                "Chieu Rong: " + width + 
                "Chieu Dai: " + height + 
                "gia Ban =" + this.DienTich() + '}';
    }
    
    
}
