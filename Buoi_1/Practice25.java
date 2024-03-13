/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi_1;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Practice25 {
    private int tuso;
    private int mauso;
    private int tuso2;
    private int mauso2;
//Khong co tham so
    public Practice25() 
    {
        this.tuso = 0;
        this.mauso = -1;
    }
// Co tham so
        public Practice25(int tuso, int mauso, int tuso2,int mauso2) 
    {
        this.tuso = tuso;
        this.mauso = mauso;
        this.tuso2 = tuso2;
        this.mauso2 = mauso2;
    }
    public void nhapPhanSo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri tu so: ");
        this.tuso = sc.nextInt();
        int so;
        do
        {
         System.out.print("Nhap gia tri mau so: ");
         so = sc.nextInt();
         if( so == 0)
         {
             System.out.println("Mau so khac 0, moi nhap lai!");
         }
        }while(so == 0);
        this.mauso = so;
    }
    public void xuatPhanSo()
    {
        String st = " " ;
        if(this.tuso ==  0)
        {
            st = "0";
        }else if(this.mauso == 1)
        {
            st = this.tuso + " ";
        }
        else 
        {
            st = this.tuso + "/" + this.mauso;
        }
        System.out.println(st);   
    }
    public void nghichDaoPhanSo()
    {
        int temp = this.mauso;
        this.mauso = this.tuso;
        this.tuso = temp;
    }
    public Practice25 PhanSoDaoNghich()
    {
        Practice25 temp = new Practice25(this.mauso,this.tuso,this.tuso2,this.mauso2);
//        Practice25 temp = new Practice25(this.mauso,this.tuso);
       return temp;
    }       
    public void nhapPhanSo2()
    {
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Input Tu so 2: ");
        tuso2 = sc2.nextInt();
        int so2;
        do
        {
         System.out.print("Nhap gia tri mau so: ");
         so2 = sc2.nextInt();
         if( so2 == 0)
         {
             System.out.println("Mau so khac 0, moi nhap lai!");
         }
        }while(so2 == 0);
        this.mauso2 = so2;     
    }
    public void xuatPhanSo2()
    {
        String st2 = " " ;
        if(this.tuso2 ==  0)
        {
            st2 = "0";
        }else if(this.mauso2 == 1)
        {
            st2 = this.tuso2 + " ";
        }
        else 
        {
            st2 = this.tuso2 + "/" + this.mauso2;
        }
        System.out.println(st2);
    }
//    Cong 2 phan so
    public Practice25 congPhanSo(Practice25 practice25)
    {
        Practice25 sum = new Practice25();
        int tusoChung;
        int mausoChung;
    if (this.mauso != practice25.mauso2) {
        // tu so
       tusoChung = this.tuso * this.mauso2 + this.tuso2 * this.mauso;
        //mau so
       mausoChung= this.mauso * this.mauso2 ;
    } else {
        // tu so
        tusoChung = this.tuso + this.tuso2 ;
        // mau so
        mausoChung = this.mauso;
    }
   System.out.println("Result: " + tusoChung + " / " + mausoChung);
   System.out.println("Sau khi rut gon ");
    int gcd = greatestCommonDivisor(tusoChung, mausoChung);

    sum.tuso = tusoChung / gcd;
    sum.mauso = mausoChung / gcd;
    return sum;
    }
//    Tru 2 phan so
    public Practice25 truPhanSo(Practice25 practice25)
    {
        Practice25 minus = new Practice25();
        int tusoChung;
        int mausoChung;
    if (this.mauso != practice25.mauso2) {
        // tu so
       tusoChung = (this.tuso * this.mauso2) - (this.tuso2 * this.mauso);
        //mau so
       mausoChung= this.mauso * this.mauso2;
    } else {
        // tu so
        tusoChung = this.tuso - this.tuso2 ;
        // mau so
        mausoChung = this.mauso;
    }
   System.out.println("Result: " + tusoChung + " / " + mausoChung);
   System.out.println("Sau khi rut gon ");
    int gcd = greatestCommonDivisor(tusoChung, mausoChung);

    minus.tuso = tusoChung / gcd;
    minus.mauso = mausoChung / gcd;
    return minus;
    }
//    Nhan 2 Phan So
    public Practice25 nhanPhanSo(Practice25 practice25)
    {
        Practice25 multiply = new Practice25();
        int tusoChung;
        int mausoChung;
        // tu so
       tusoChung = this.tuso * this.tuso2;
        //mau so
       mausoChung= this.mauso * this.mauso2;
   System.out.println("Result: " + tusoChung + " / " + mausoChung);
   System.out.println("Sau khi rut gon ");
    int gcd = greatestCommonDivisor(tusoChung, mausoChung);

    multiply.tuso = tusoChung / gcd;
    multiply.mauso = mausoChung / gcd;
    return multiply;
    }
// Chia 2 Phan So
     public Practice25 chiaPhanSo(Practice25 practice25)
    {
        Practice25 divide = new Practice25();
        int tusoChung;
        int mausoChung;
        // tu so
       tusoChung = this.tuso * this.mauso2;
        //mau so
       mausoChung= this.mauso * this.tuso2;
   System.out.println("Result: " + tusoChung + " / " + mausoChung);
   System.out.println("Sau khi rut gon ");
    int gcd = greatestCommonDivisor(tusoChung, mausoChung);

    divide.tuso = tusoChung / gcd;
    divide.mauso = mausoChung / gcd;
    return divide;
    }
private int greatestCommonDivisor(int a, int b) {
    if (b == 0) {
        return a;
    } else {
        return greatestCommonDivisor(b, a % b);
    }
}
}


    
        

