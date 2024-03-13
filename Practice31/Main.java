/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice31;

import Practice29.CEO_Fong_Company;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        MainCuaCompanyABC company = new MainCuaCompanyABC();
        
        company.inputCacThongSo();
        
        System.out.println("Value Of All Estates: " + company.tinhLuongCongTy());
        
        System.out.println("Value Of Empty Estates: " +company.tongDatTrong());
        
        System.out.println("Value Of House Estates: " + company.tongNhaLau());
        
        System.out.println("Value Of Palace Estates: " + company.tongBietThu());
        
        System.out.println("Value Of Hotel Estates: " + company.tongKhachSan());
        
        
        company.outputThongTin();
    }
}
