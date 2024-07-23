package vize2017;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dilay
 */
public class fibonacci {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        int yedek;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < 8; i++) {
            System.out.println(a+b);
            yedek=b;
            b=a+b;
            a=yedek;
        }
    }
}
