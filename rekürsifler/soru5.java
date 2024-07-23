/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algo1final.rekürsifler;

/**
kendisine par olarak gelen tamsayı dizisiniz sıralı olup olmadığını geri döndüren rekürsif metod
 */
public class soru5 {
   public static boolean sıraliMi(int []a,int ind){
       if(ind==a.length-1) return true;
       else if(a[ind]<a[ind+1]) return sıraliMi(a, ind+1);
       else return false;
   } 
    public static void main(String[] args) {
        int[]a={1,3,2,4,5};
        System.out.println(sıraliMi(a, 0));
    }
}
