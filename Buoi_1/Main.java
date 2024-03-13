/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi_1;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args)
    {
        Practice21 bai = new Practice21(7);
        bai.draw();
        System.out.println("\n--------------\n");
        Practice20 bai20 = new Practice20(7);
        bai20.draw20();
        System.out.println("\n--------------\n");
//        Phan So   
        System.out.println("\n-------------Phan so---------------------\n");
        Practice25 bai25 = new Practice25();
        bai25.nhapPhanSo();
        bai25.xuatPhanSo();
        bai25.PhanSoDaoNghich();
        bai25.nhapPhanSo2();
        bai25.xuatPhanSo2();
        
        System.out.println("\n-------------Cong 2 phan so--------------\n");
        Practice25 tong = bai25.congPhanSo(bai25);
        System.out.print("Result: ");
        tong.xuatPhanSo();
        
         System.out.println("\n-------------Tru 2 phan so--------------\n");
        Practice25 tru = bai25.truPhanSo(bai25);
        System.out.print("Result: ");
        tru.xuatPhanSo();
        
         System.out.println("\n-------------Nhan 2 phan so--------------\n");
        Practice25 nhan = bai25.nhanPhanSo(bai25);
        System.out.print("Result: ");
        nhan.xuatPhanSo();
        
         System.out.println("\n-------------Chia 2 phan so--------------\n");
        Practice25 chia = bai25.chiaPhanSo(bai25);
        System.out.print("Result: ");
        chia.xuatPhanSo();
    }
    
}
