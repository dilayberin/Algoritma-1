/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vize2017;

import java.util.Scanner;

/**
 *
 * @author dilay
 */
public class tamsayilerleislem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int enb, enk;
        int giris;
        System.out.println("sayı girin ->");
            enb = s.nextInt();
            enk = enb;
        int toplam = enb;
        for (int i = 0; i < 4; i++) {
            System.out.println("sayı girin ->");
            giris = s.nextInt();
            toplam+=giris;
            
            if(giris<enk){
                enk = giris;
            }
            if(giris> enb){
                enb = giris;
            }
        }
        if(!(toplam == 0)){
            System.out.println("En büyük ->" + enb + "\n" + "En küçük ->" + enk + "\n" + "Ortalama->" + (toplam/5));
        }else{
            
            System.out.println("En büyük ->" + enb + "\n" + "En küçük ->" + enk + "\n" + "Ortalama hesaplanamaz.");
        }
        
    }
}
