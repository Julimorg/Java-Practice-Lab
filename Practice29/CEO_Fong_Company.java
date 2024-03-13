/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice29;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class CEO_Fong_Company {
        ArrayList<Pratice29> list;
        public CEO_Fong_Company()
        {
            this.list = new ArrayList<>();
            Pratice29 nv1 = new Pratice29("Fong",2019);
            list.add(nv1);
        }
        public void nhapDanhSachNhanVIen()
        {
            int choice;
            Scanner sc  = new Scanner(System.in);
            do
            {
                System.out.print("Menu: ");
                System.out.print("1. Nhan vien van phong: ");
                System.out.print("2. Nhan vien san xuat: ");
                System.out.print("3. Nhan vien quan ly: ");
                System.out.print("0. Exit!");
                System.out.print("Moi ban chon tu 0...3");
                choice = sc.nextInt();
                switch(choice)
                {
                    case 1: NhanVienVanPhong_Practice29 vp = new NhanVienVanPhong_Practice29();
                    vp.nhapThongTinNhanVien();
                    this.list.add(vp);
                    break;
                    
                    case 2: NhanVienSanXuat_Practice29 sx = new NhanVienSanXuat_Practice29();
                    sx.nhapThongTinNhanVien();
                    this.list.add(sx);
                    break;
                    
                    case 3: NhanVienQuanLy_Practice29 ql = new NhanVienQuanLy_Practice29();
                    ql.nhapThongTinNhanVien();
                    this.list.add(ql);
                }
            }while(choice != 0);
        }
        
        public void outputNhanVien()
        {
            for(Pratice29 nv : list)
            {
                System.out.println(nv.toString());
            }
        }
        
        // Tinh Luong Cong TY
        public long tinhLuongCongTy()
        {
            long tong = 0;
            for(Pratice29 nv :list)
            {
                tong += nv.tinhLuongNhanVien(); 
            }
            return tong;
        }
        // Tinh Luong Nhan Vien Van Phong
        public long tinhLuongNhanVienVanPhong()
        {
           long tong2 = 0;
           for(Pratice29 nv : list)
           {
               if(nv instanceof NhanVienVanPhong_Practice29)
               {
                   tong2 += nv.tinhLuongNhanVien();
               }
           }
           return tong2;
        }
        
        // Tinh Luong Nhan Vien San Xuat
     public long tinhLuongNhanVienSanXuat()
        {
           long tong3 = 0;
           for(Pratice29 nv : list)
           {
               if(nv instanceof NhanVienSanXuat_Practice29)
               {
                   tong3 += nv.tinhLuongNhanVien();
               }
           }
           return tong3;
        }
//     Tinh Luong Nhan Vien Quan Ly
     public long tinhNhanVienQuanLy()
        {
           long tong4 = 0;
           for(Pratice29 nv : list)
           {
               if(nv instanceof NhanVienQuanLy_Practice29)
               {
                   tong4 += nv.tinhLuongNhanVien();
               }
           }
           return tong4;
        }
}
