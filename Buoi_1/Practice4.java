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
public class Practice4 {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if( a >= b &&  a>=c)
        {
            System.out.print(a+ "is max and ");
            if ( b >= c)
            {
                System.out.print(c+ "is min ");
            }else if ( c >= b)
                    {
                        System.out.print( b+"is min");
                    }            
        }else if ( b >= a && b >=c )
        {
            System.out.print(b + "is max");
            if( a>=c)
            {
                System.out.print(c+"is min");
            }else if( a<=c)
            {
                System.out.print(a+"is min");
            }
        }else if( c >= a && c >=b)
        {
            System.out.print(c +"is max ");
            if ( a >=b)
            {
                System.out.print( b+"is min");
            }else if ( a<=b)
            {
                System.out.print(a+"is min");
            }
        }        
    }
}
