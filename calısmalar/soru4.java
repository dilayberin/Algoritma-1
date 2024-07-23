/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dilay
 */
public class soru4 {
    public static void main(String[] args) {
        String bir="ali";
        String iki="def";
        String yeni=" ";
        for (int i = 0; i < bir.length(); i++) {
            yeni+=bir.charAt(i);
            yeni+=iki.charAt(i);
        }
        System.out.println(yeni);
    }
}
