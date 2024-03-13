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
public class Practice20{
    private int height20;

    public Practice20(int height21) {
        this.height20= height21;
    }
    public void draw20()
    {
          for(int i =0 ;i<this.height20-1;i++)
            System.out.print(" ");
            System.out.println("*");
        for(int i = 1; i<this.height20 -1;i++)
        {
             for(int j = 0; j < this.height20 - i -1; j++ )
                 System.out.print(" "); 
                 System.out.print("*");
             for(int j = 0; j < 2*i -1; j++ )
                 System.out.print("*"); 
                 System.out.print("*");
                 System.out.println(" ");   
        }
        for(int i =0 ;i< 2*this.height20-1;i++)
            System.out.print("*");
    }
}
