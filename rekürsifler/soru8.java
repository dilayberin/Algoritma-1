/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algo1final.rekürsifler;

/**
kendisine parametre olarak gelen sayının basamak sayısını geri döndüren rekürsif
 */
public class soru8 {
  public static int bas(int x,int sayac){
      if(x<10&x>=0) return 1;
      else{
          x=x/10;
          return bas(x,sayac+1)+1;
      }
  }  
    public static void main(String[] args) {
        System.out.println(bas(10245, 0));
    }
}
