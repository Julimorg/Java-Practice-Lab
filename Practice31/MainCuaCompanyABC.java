/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice31;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class MainCuaCompanyABC {
   ArrayList<CompanyABC> list;
    public MainCuaCompanyABC()
        {
            this.list = new ArrayList<>();
        }
     public void inputCacThongSo()
        {
            int choice;
            Scanner sc  = new Scanner(System.in);
            do
            {
                System.out.println("Menu: ");
                System.out.println("1. Dat Trong: ");
                System.out.println("2. Nha va So Lau: ");
                System.out.println("3. Khach San: ");
                System.out.println("4. Biet Thu: ");
                System.out.println("0. Exit!");
                choice = sc.nextInt();
                switch(choice)
                {
                    case 1: DatTrong dat = new DatTrong();
                    dat.nhapThongTinCuaDoiTuong();
                    this.list.add(dat);
                    break;
                    case 2: NhaVaSoLau lau = new NhaVaSoLau();
                    lau.nhapThongTinCuaDoiTuong();
                    this.list.add(lau);
                    break;
                    case 3: KhachSan hotel = new KhachSan();
                    hotel.nhapThongTinCuaDoiTuong();
                    this.list.add(hotel);
                    break;
                    case 4: BietThu empire = new BietThu();
                    this.list.add(empire);
                    break;
                    default:
                        System.out.print("no function!");
                        break;
                }
            }while(choice != 0);
        }
     public void outputThongTin()
        {
            for(CompanyABC nv : list)
            {
                System.out.println(nv.toString());
            }
        }
  // Tinh Luong Cong TY
        public long tinhLuongCongTy()
        {
            long tong0 = 0;
            for(CompanyABC nv :list)
            {
                tong0 += nv.DienTich(); 
            }
            return tong0;
        }
       // Tinh Tong DatTrong
        public long tongDatTrong()
        {
            long tong = 0;
            for(CompanyABC nv :list)
            {
                if(nv instanceof DatTrong)
               {
                   tong += nv.DienTich();
               }
            }
            return tong;
        }
        //Tinh Tong NhaLau
        public long tongNhaLau()
        {
            long tong1 = 0;
            for(CompanyABC nv :list)
            {
                if(nv instanceof NhaVaSoLau)
               {
                   tong1 += nv.DienTich();
               }
            }
            return tong1;
        }
        //Tinh Tong Khach San
        public long tongKhachSan()
        {
            long tong2 = 0;
            for(CompanyABC nv :list)
            {
                if(nv instanceof KhachSan)
               {
                   tong2 += nv.DienTich();
               }
            }
            return tong2;
        }
       //Tinh Tong Biet Thu
        public long tongBietThu()
        {
            long tong3 = 0;
            for(CompanyABC nv :list)
            {
                if(nv instanceof BietThu)
               {
                   tong3 += nv.DienTich();
               }
            }
            return tong3;
        }
}
