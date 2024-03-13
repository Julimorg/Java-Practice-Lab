/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice29;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Pratice29 {
    protected String hoTen;
    protected int namVaoLam;
    protected long luongCoban = 1490000;

    public Pratice29(String hoTen, int namVaoLam) {
        this.hoTen = hoTen;
        this.namVaoLam = namVaoLam;
    }

    public Pratice29()
    {
    }
    
    public long tinhLuongNhanVien()
    {
        return this.luongCoban;
    }
    public void nhapThongTinNhanVien()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("input Ho Ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Input nam vao lam: ");
        this.namVaoLam = sc.nextInt();
    }
}
