/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algo1final.rekürsifler;

/**
kednisine parametre gelen sayı kadar ekrana adını yazan rekürsif
 */
public class soru10 {
    public static String isim(String a,int x){
        if(x>0){
            System.out.println(a);
            return isim(a, x-1);
        }
        else return " ";
}
    public static void main(String[] args) {
        isim("dilay", 5);
    }
}
