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
public class Practice13 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a ;
        do
        {
        System.out.print("input N:  ");
        a = sc.nextInt();
        if( a < 0)
        {
            System.out.print("please input N must positive number!");
        }
        }while( a < 0);
        System.out.print("the odd number of I : ");
        for (int i = 1 ; i<= a ;i++)
        {
               if ( a % i == 0 )
               {
                   if ( a % 2 != 0)
                   {
                   System.out.println( i);  
                   }else if ( a % 2  == 0)
                   {
                       System.out.println( i);
                   }
               }
        }
        
    }
}
