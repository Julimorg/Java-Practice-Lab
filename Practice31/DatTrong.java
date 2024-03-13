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
public class DatTrong extends CompanyABC{

    public DatTrong() {
    }

   
    public DatTrong(int dientich, int maSo, int height, int width, int phuongThucGiaTri) {
        super(maSo, height, width, phuongThucGiaTri);
    }

  

    @Override
    public void nhapThongTinCuaDoiTuong() {
        super.nhapThongTinCuaDoiTuong(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody  

    }
    
      @Override
    public long DienTich() {
        return ((this.width * this.height) * 10000); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }  

    @Override
    public String toString() {
        return "Dat{" + 
                "Chieu Rong: " + width +
                "Chieu Dai: " + height +
                "Dien Tich: " + (width * height) +
                "giaBan=" + this.DienTich() + '}';
    }
   
     
 
      
}
