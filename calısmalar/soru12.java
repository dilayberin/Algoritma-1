
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 girilen iki kelimedeki aynı indisteki karakterleri döndür
 */
public class soru12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String cümle=s.nextLine();
        String cümle2=s.nextLine();
        String yeni=" ";
        for (int i = 0; i < cümle.length(); i++) {
            if(cümle.charAt(i)==cümle2.charAt(i)){
                yeni+=cümle.charAt(i);
            }
        }
        System.out.println(yeni);
    }
}
