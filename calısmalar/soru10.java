/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dilay
 */
public class soru10 {
    public static void main(String[] args) {
        
        double pay=1.0;
        double payda=3.0;
        double toplam=0.0;
        for (double i = 0; i < 3; i++) {
            toplam+=(pay/payda);
            pay++;
            payda+=4;
        }
        System.out.println(toplam);
    }
   
}
