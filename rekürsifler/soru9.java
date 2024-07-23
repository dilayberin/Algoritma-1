/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algo1final.rekürsifler;

/**
kendisine parametre olarak gelen String in palindrom olup olmadığını geri döndüren rekürsif
 */
public class soru9 {
    public static boolean palindromMu(String x,int indBas,int indSon){
        if(indBas==x.length()) return true;
        else if(x.charAt(indBas)!=x.charAt(indSon)) return false;
        else return palindromMu(x, indBas+1, indSon-1);
    }
    public static void main(String[] args) {
        
        System.out.println(palindromMu("ali", 0, 2));
    }
}
