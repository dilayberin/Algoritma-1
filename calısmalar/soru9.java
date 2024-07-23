package calısmalar;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *cümlede kaç kelime vaer
 */
public class soru9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String cümle=s.nextLine();
        int sayac=0;
        for (int i = 0; i < cümle.length(); i++) {
            if(cümle.charAt(i)==' '){
                sayac++;
            }
        }
        System.out.println(sayac+1);
    }
}
