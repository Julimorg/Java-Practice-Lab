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
public class Practice3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a ,b ;
         a = sc.nextInt();
         b = sc.nextInt();
         if( a>=b)
         {
             System.out.print(a + " is larger than " + b);
         }else if( a <= b)
         {
             System.out.print( a + " is smaller than " + b);
         }else 
         {
             System.out.print(a + "is equal with" + b);
         }
             
    }
}
