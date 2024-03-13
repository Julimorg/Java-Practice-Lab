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
public class Practice8 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a;
        do
        {
            System.out.print("Input number:  ");
            a = sc.nextDouble();
            if ( a<=0 || a>=10 )
            {
            System.out.println("Wrong Valid! Please input the number in range 1 to 10!\n");
            }
        }while( a<=0 || a>=10);
        if(a >= 8.5)
        {
            System.out.print(a +" => A");
        }else if(a>= 7.0)
        {
            System.out.print(a +" => B");
        }else if(a>= 5.5)
        {
            System.out.print(a +" => C");
        }else if( a>= 4.0)
        {
            System.out.print(a +" => D");
        }else if ( a<4)
        {
            System.out.print(a +" => F");
        }
        
    }
}
