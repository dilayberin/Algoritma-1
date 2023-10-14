import java.util.Arrays;
import java.util.Scanner;

/*SORU5
klavyeden rastegele sayılar giriliyor bu sayılar içinde 10 tane asal sayı girildiğinde bu sayıları diziye atan ve dizideki en büyük
sayıyı ekrana yazan program*/ 
public class soru5 {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        int arr[]=new int[10];
        int max=arr[0];
        int b=0;
        int asalSayac=0;
        for (int i = 0; ; i++) {
            System.out.println("sayı gir");
            int a=k.nextInt();
            if(asalMi(a)==true){
               if(asalSayac<=10){
                    asalSayac++;
                    arr[b]=a;
                    b++;
               }

            }}
    }
    public static boolean asalMi(int a){
        for (int i = 2; i < Math.sqrt(a); i++) {
            if(a/i==0)
                return false;
            
        }
        return true;
    } 
    
    
    public static int en_büyük(int[]a){
        int imax=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>imax){
                imax=a[i];
            }
        }
        return imax;
    }
    }