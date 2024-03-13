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
public class Practice26 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b =  sc.nextInt();
        for(int i = 0 ; i< a ; i++)
        {
            System.out.println(" ");
            for (int j = 0 ; j<b; j++)
            {
                if(  i == 0 || j == 0 || i == a - 1 || j == b - 1 )
                {
                    System.out.print("* ");
                }else 
                {
                    System.out.print("  ");
                }
            }
        }
        
    }
}
