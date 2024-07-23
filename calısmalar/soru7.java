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
public class soru7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String kelime=s.nextLine();
        for (int i = kelime.length()-1; i >0; i--) {
            if(kelime.charAt(i)=='a'){
                System.out.println(i);
                break;
            }
        }
    }
}
