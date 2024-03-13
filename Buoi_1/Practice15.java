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
public class Practice15 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("input the limit: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for(int i = 0 ;i<n;i++)
        {
            a[i] = sc.nextInt();
            if ( a[i] != 0)
            {
                 sum+=a[i]; 
            } else 
            {
                
                System.out.print("Error!, please enter a num without 0\n");
                break;
            }
             
        }                 
       System.out.print("\n " + sum);
    }
}
