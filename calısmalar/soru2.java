/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dilay
 */
public class soru2 {
    public static void main(String[] args) {
        System.out.println(1);
        int pay=2;
        int payda=pay+1;
        double toplam=0.0;
        for (int i = 2; i < 5; i++) {
            System.out.println((pay*pay)+"/"+(payda));
            toplam=toplam+((pay*pay)/(payda))+1;
           
            pay++;
            payda++;
        }
         System.out.println("toplam"+" "+toplam);
    }
}
