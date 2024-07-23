/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algo1final.rekürsifler;

import java.util.Arrays;

/**
 kendisine par olarak gelen dizinin her bir elemanını 1 arttırıp geri döndüren rekürsif
 */
public class soru7 {
    public static int[] dizi(int[]x,int ind){
        if(ind==x.length) return x;
        else {
             x[ind]++;
            return dizi(x, ind+1);
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
       dizi(a, 0);
        System.out.println(Arrays.toString(a));
        
    }
}
