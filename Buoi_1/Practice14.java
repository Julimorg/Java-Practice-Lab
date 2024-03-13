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
public class Practice14 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if( a % 1 == 0 && a % a  == 0)
        {
         System.out.print(" la uoc so");   
        }else 
        {
            System.out.print(" khong phai uoc so");
        }
    }
    
}
