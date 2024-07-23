/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algo1final.rekürsifler;

/**
 kendisine parametre olarak gelen sayının faktöriyelini hesaplayan rekürsif
 */
public class soru1 {
    public static int factor(int sayı){
        if (sayı==0) return 1;
        else return sayı*factor(sayı-1);
    }
    public static void main(String[] args) {
        System.out.println(factor(4));
    }
}
