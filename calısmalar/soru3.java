
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dilay
 */
public class soru3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String yeni=" ";
        while(true){
            System.out.println("bir kelime gir:");
            String kelime=s.nextLine();
            if(!kelime.equals("cikis")){
                yeni+=kelime;
            }
            else
                break;
        }
    }
  
}
