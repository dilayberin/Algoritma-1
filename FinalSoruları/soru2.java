import java.util.Arrays;
import java.util.Scanner;


/*SORU3
klavyeden girilmiş olan iki boyutlu string dizisi içindeki tek karaktere sahip olanları ekrana yazan metod*/
public class soru2 {

    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        String s[][]=new String[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                s[i][j]=l.nextLine();
            }
        }
        String c[]=tek(s);
        System.out.println(Arrays.toString(c));
    
    }
    public static String[] tek(String[][]a){
        String str=" ";
        String s[]=new String[a.length+a[0].length];
        int k=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j].length()==1){
                str+=a[i][j];
                s[k]=str;
                k++;
                str=" ";
            }
        }
             
    }
    
    return s; 
}
}
