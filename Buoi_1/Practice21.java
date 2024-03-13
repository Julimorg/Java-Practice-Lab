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
public class Practice21 {
    private int height;

    public Practice21(int height) {
        this.height = height;
    }
    public void draw()
    {
        for(int i =0 ;i<this.height-1;i++)
        {
            System.out.print(" ");
        }
            System.out.println("*");
        for(int i = 1; i<this.height -1;i++)
        {
             for(int j = 0; j < this.height - i -1; j++ )
             {
                 System.out.print(" "); 
             }
                 System.out.print("*");          
             for(int j = 0; j < 2*i -1; j++ )
                 System.out.print(" "); 
                 System.out.print("*");
                 System.out.println("");   
        }
        for(int i =0 ;i< this.height;i++)
            System.out.print("* ");
    }
 

}
