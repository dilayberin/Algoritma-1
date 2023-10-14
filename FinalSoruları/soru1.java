import java.util.Arrays;
import java.util.Scanner;
/*SORU-1
klavyeden girilen iki stringin karakterleri arasında (yerleri aynı olacak) birbirinden farklı karakterleri 
birleştirip geri döndüren metodu yazınız
(string uzunlukları eşit olacak)*/

public class soru1 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("lütfen 1. kelimeyi gir:");
        String ss=k.nextLine();
        System.out.println("lütfen 2. kelimeyi gir:");
        String sss=k.nextLine();
        
        String as[]=metin(ss,sss);
        System.out.println(Arrays.toString(as));
        
         
    }
    public static String[] metin(String a,String b){
        String str=" ";
        int m=0;
        String s[]=new String[a.length()];
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)!=b.charAt(i)){
                str=str+a.charAt(i);
                str=str+b.charAt(i);
                s[m]=str;
                m++;
                str=" ";
            }
        }
        return s;
    }
}
