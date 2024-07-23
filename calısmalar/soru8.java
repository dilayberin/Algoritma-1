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
public class soru8 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        int sayi=s.nextInt();
        boolean asal=true;
        for (int i = 2; i < Math.sqrt(sayi); i++) {
            if(sayi%i==0){
                asal=false;
                break;
            }
        }
        if(asal){
            System.out.println("asal");
        }
        else{
            System.out.println("degil");
        }
    }
}
