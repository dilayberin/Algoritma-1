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
public class soru11 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String cümle=s.nextLine();
        boolean sira=true;
        for (int i = 0; i < cümle.length()-1; i++) {
            
            if(cümle.charAt(i)>='A'&&cümle.charAt(i)<='Z'||cümle.charAt(i)>='a'&&cümle.charAt(i)<='z'){
                if(cümle.charAt(i)>cümle.charAt(i+1)){
                    sira=true;
                }
                else{
                    sira=false;
                    break;
                }
            }
        }
        if(sira) System.out.println("evet");
        else System.out.println("hayır");
    }
}
