/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algo1final.rekürsifler;

import java.util.Scanner;

/**
 kendisine par olarak gelen stringteki küçük karakterlerin sayısını geri döndüren rekürsif
 */
public class soru4 {
    public static int kucuk(String kelime,int indis,int sayac){
        if(indis==kelime.length()) return sayac;
        else if(kelime.charAt(indis)>='a'&& kelime.charAt(indis)<='z') return kucuk(kelime,indis+1,sayac+1);
        else return kucuk(kelime,indis+1,sayac);
            
    }
    public static void main(String[] args) {
        System.out.println(kucuk("BERİN", 0, 0));
    }
}
