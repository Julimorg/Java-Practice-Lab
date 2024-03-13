/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi_1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Practice5 {
    public static void main(String[] args)
    {
        System.out.print("Ax^2 + Bx + C  = 0\n");
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        System.out.print("input A: ");
        a = sc.nextFloat();
        System.out.print("input B: ");
        b =sc.nextFloat();
        System.out.print("input C: ");
        c = sc.nextFloat();
        System.out.print(a+ " x^2 + " + b + "+ x + " + c + " = 0");
        if ( a == 0)
        {
            float bac1 = -c/b;
            System.out.print("the result of X= "+bac1);
        }else
        {
        float delta = b*b - 4*a*c;
         if( delta == 0)
         {
             float solve1 =-b/(2*a);
             System.out.print("the result is x1 = x2 = "+solve1 );
         }else if( delta > 0)
         {
             float x1 = (float) (-b + sqrt(delta)) / (2 * a);
             float x2 = (float) (-b - sqrt(delta)) /( 2 * a);
             System.out.print("the result is x1 = " + x1 +"and x2 = " +x2);
         }else 
         {
             System.out.print("\nError!");
         }
        }
        }
    }
    
