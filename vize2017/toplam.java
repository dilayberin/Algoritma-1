package vize2017;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dilay
 */
public class toplam {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int toplam=0;
        for (int i = 0;; i++) {
            System.out.println("sayı gir:");
            int sayi=s.nextInt();
            if(sayi!=0){
                toplam+=sayi;
            }
            else{
                System.out.println("o girdin, program bitti");
                break;
            }
            
                    
        }
        System.out.println("toplam:"+ " "+toplam);
        
    }
}
