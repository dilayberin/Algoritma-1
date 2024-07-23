/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algo1final.rekürsifler;

/**
 kendisine parametre olarak gelen Stringi ters çevirip geri döndüren rekürsif
 */
public class soru6 {
   public static String ters(String a,int ind) {
       if(ind==a.length()) return " ";
       else return ters(a, ind+1)+a.charAt(ind);
   }
    public static void main(String[] args) {
        System.out.println(ters("ali", 0));
    }
}
