package calısmalar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 2,4,8,16,32
 */
public class NewClass {
    public static void main(String[] args) {
        int sayi=1;
        int toplam=0;
        for (int i = 0; i < 10; i++) {
            sayi=sayi*2;
            toplam+=sayi;
        }
        System.out.println(toplam/10);
    }
 
}
