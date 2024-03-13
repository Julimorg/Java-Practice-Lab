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
public class Practice6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("input Years: ");
        int a = sc.nextInt();
        if( a %  4 == 0 && a % 100  !=0 )
        {
            System.out.print(a + " la năm nhuận ");
        }else
        {
            System.out.print(a + "la nam khong nhuan");
        }
        
       
    }
    
}
