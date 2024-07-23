package calısmalar;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dilay
 */
public class soru6 {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String kelime=s.nextLine();
      int j=0;
       boolean palindrom = true;
        for (int i = 0; i < kelime.length()/2; i++) {
            if(kelime.charAt(j)==kelime.charAt(kelime.length()-1-i)){
                 j++;
            }
            else{
                palindrom =false;
                break;
            }
        }
        if(palindrom){
            System.out.println("palindrokm");
        }
       
    }
}
