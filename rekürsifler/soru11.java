/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algo1final.rekürsifler;

/**
kendisine parametre olarak gelen Stringteki boşlukları silip geri döndüren rekürsif
 */
public class soru11 {
    public static String kelime(String a, int ind) {
        if (ind == a.length())  return " "; 
         else if (a.charAt(ind) == ' ') return kelime(a, ind + 1);
         else  return a.charAt(ind) + kelime(a, ind + 1);
        
    }

    public static void main(String[] args) {
        System.out.println(kelime("dilay berin", 0));
    }
}

