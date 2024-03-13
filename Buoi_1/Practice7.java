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
public class Practice7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("input month:  ");
        int a = sc.nextInt();
        if ( a == 2 )
        {
            System.out.print("Please input the Year: ");
            int b = sc.nextInt();
            if ( b % 4 == 0 && b % 100 !=0)
            {
                System.out.print("Trong Nam Nhuan thi thang: " +  a + "co 29 ngay");
            }else 
            {
                System.out.print("Khong Phai nam nhuan thi thang: " + a + " co 28 ngay");
            }
        }else
        {
            switch(a)
            {
                case 1:
                    System.out.print(a +" co 31 ngay");
                    break;
                case 3:
                     System.out.print(a +" co 31 ngay");
                     break;
                case 5:
                     System.out.print(a +" co 31 ngay");
                     break;
                case 7:
                     System.out.print(a +" co 31 ngay");
                     break;
                case 8:
                     System.out.print(a +" co 31 ngay");
                     break;
                case 10:
                     System.out.print(a +" co 31 ngay");
                     break;
                case 12:
                     System.out.print(a +" co 31 ngay");
                     break;
                case 4:
                     System.out.print(a +" co 30 ngay");
                     break;
                case 6:
                     System.out.print(a +" co 30 ngay");
                     break;
                case 9:
                     System.out.print(a +" co 30 ngay");
                     break;
                case 11:
                     System.out.print(a +" co 30 ngay");
                     break;
                default: 
                     System.out.print("out of month! Please input again!");
                     break;
                              
            }
        }
             
        
    }
    
}
