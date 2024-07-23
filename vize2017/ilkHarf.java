package vize2017;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dilay
 */
public class ilkHarf {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.println("kelimeler gir:");
            String kelime=s.nextLine();
            for (int i = 0; i < kelime.length(); i++) {
               if(kelime.charAt(0)=='a'&&kelime.charAt(0)=='A'){
                   System.out.println(kelime);
               }
               else if(kelime.charAt(0)=='q'){
                   System.out.println("yanlışşşş...");
                   
               }
               break;
            }
            
        }
    }
}
