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
public class CompanyABC {
    protected int maSo;
    protected int height;
    protected int width;
    protected int phuongThucGiaTri;

    public CompanyABC() {
    }
            

    public CompanyABC(int maSo, int height, int width, int phuongThucGiaTri)
    {
        this.maSo = maSo;
        this.height = height;
        this.width = width;
        this.phuongThucGiaTri = phuongThucGiaTri;
    }
    public long DienTich()
    {
        return this.height * this.width;
    }
     public void nhapThongTinCuaDoiTuong()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("input ma so:  ");
        this.maSo = sc.nextInt();
        System.out.print("input height: ");
        this.height = sc.nextInt();
        System.out.print("input width: ");
        this.width = sc.nextInt();
        System.out.print("input phuong thuc gia tri: ");
        this.phuongThucGiaTri = sc.nextInt();
    }
}
