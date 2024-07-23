package calısmalar;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dilay
 */
public class soru5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("iki sayı gir:");
        int a=s.nextInt();
        int b=s.nextInt();
        int sayac1=0;
        int sayac2=0;
        int sayac3=0;
        
            for (int i = a; i <=b; i++) {
                if(i<=9 && i>=0){
                    sayac1++;
                }
                else if(i>=10 && i<=99){
                    sayac2++;
                }
                else if(i>=100 && i<=999){
                    sayac3++;
                }
                else{
                    
                }
            
        }
        System.out.println("1 li basamak"+" "+sayac1);
        System.out.println("2 li basamak"+" "+sayac2);
        System.out.println("3 li basamak"+" "+sayac3);
    }
}
