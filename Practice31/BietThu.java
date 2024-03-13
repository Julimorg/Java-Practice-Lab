/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice31;

/**
 *
 * @author acer
 */
public class BietThu extends CompanyABC{
    public BietThu() {
    }

    @Override
    public void nhapThongTinCuaDoiTuong() {
        super.nhapThongTinCuaDoiTuong(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public long DienTich() {
        return (((this.width * this.height) * 1000) * 400000); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return "BietThu{" + 
                "Chieu Rong: " + width+ 
                "Chieu Dai: " + height +
                "Gia Ban: " + this.DienTich()+ '}';
    }

    
    
}
