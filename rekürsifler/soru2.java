/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algo1final.rekürsifler;

/**
kendisine parametre olarak gelen sayıya kadarki toplamı hesapla rekürsif
 */
public class soru2 {
    public static int toplam(int sayı){
        if(sayı==0) return 0;
        else return sayı+toplam(sayı-1);
    }
    public static void main(String[] args) {
        System.out.println(toplam(4));
    }
}
