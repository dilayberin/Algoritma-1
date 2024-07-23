
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dilay
 */
public class soru {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("sayı giriniz:");
        int a=s.nextInt();
        int enk=a;
        int enb=a;
        int toplam=0;
        for (int i = 0; i < 3; i++) {
            System.out.println("sayı gir:");
            int sayi=s.nextInt();
            if(sayi<enk){
                enk=sayi;
                toplam+=sayi;
            }
            else if(sayi>enb){
                enb=sayi;
                toplam+=sayi;
            }
        }
        
        System.out.println("enb:"+enb+"enk:"+enk+"ort:"+(toplam+a)/4);
    }
  
}
