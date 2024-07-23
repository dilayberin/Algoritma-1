/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algo1final.rekürsifler;

import java.util.Scanner;

/**
kendisine parametre olarak gelen sayının a^b sini hesaplayan rekürsif
 */
public class soru3 {
    public static int üsHesapla(int a,int b){
        if(b==0) return 1;
        else  return a*üsHesapla(a, b-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(üsHesapla(a, b));
    }
}
