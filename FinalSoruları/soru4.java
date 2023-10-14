import java.util.Scanner;

 /*SORU-4
    Klavyeden girilen sayılar içerisinde sıfır sayısı girildiğinde o ana kadarki sayıları toplayan
    ve bu işlemi 10 kere yapan programı yazın
    */

public class soru4 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int t=0;
        int sayac;
        for (int i = 0; ;i++) {
            System.out.println("sayı giriniz");
            int a=k.nextInt();
            t+=a;
            if(a==0){
                 for ( sayac = 0; sayac < 10; sayac++){
                    
                 }
                  System.out.println("sıfır girilene kadarki sayıların toplamı."+t);
            }
                
            }
            
    }
}
