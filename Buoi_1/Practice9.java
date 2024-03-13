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
public class Practice9 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a , b;
        double fee;
        do
        {
        System.out.print("input old electric num: ");
         a = sc.nextInt();
        System.out.print("input new electric num: ");
         b = sc.nextInt();
        if( a >= b )
        {
            System.out.print("Please enter again! the Old electric num must << the new");
        }
        }while ( a >= b);
        int newElectricNum = b - a;
        fee = 0;
        if ( newElectricNum <=50 )
        {
            System.out.print("Bac 1\n");
            fee = newElectricNum * 1480;
            System.out.print("the fee you should pay: " + newElectricNum);
        }else if (newElectricNum >= 52 )
        {
            System.out.print("Bac 2\n");
            fee = 50 * 1480 + ((newElectricNum - 50) * 1533);
            System.out.print("the fee you should pay: " + newElectricNum);
        }else if (newElectricNum >= 101)
        {
           System.out.print("Bac 3s\n"); 
           fee = 50 * 1480 + 50 * 1533 + ((newElectricNum -100 ) * 1786);
           System.out.print("the fee you should pay: " + newElectricNum);
        }else if (newElectricNum >= 2242)
        {
            System.out.print("Bac 4\n");
           fee = 50 * 1480 + 50 * 1533 + 100 * 1786 + ((newElectricNum -200 ) * 2242);
           System.out.print("the fee you should pay: " + newElectricNum);
        }else if ( newElectricNum >= 2503)
        {
          System.out.print("Bac 5\n");
           fee = 50 * 1480 + 50 * 1480 + 100 * 1786 + 100 * 2503 + ((newElectricNum -300 ) * 2503);
           System.out.print("the fee you should pay: " + newElectricNum);  
        }
            
        
    }
}
