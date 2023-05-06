package day12forloopwhileloop;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {

        //Example 1)3ten 10a kadar tamsayilari ekrana yazdirin

        for(int i=3; i<11; i++){
            System.out.print(i+ " ");

        }
        System.out.println();

        //2.yol while loop

        int i=3;
        while(i<11){
            System.out.print(i+ " ");
            i++;
        }
        System.out.println();

        //Example 2)23ten 12ye kadar cift tamsayilari ekrana yazdiriniz

        int k= 23;
         while(k>=12){
             if(k%2==0){
                 System.out.print(k+ " ");
             }
             k--;
         }
        System.out.println();

        //Example 3)Verilen bir tamsayinin rakamlari toplamini konsola yazdiran kodu yazdiriniz

        int num = 578;
         int sum = 0;
         while(num>0){
             sum = sum +num%10;
             num/=10;
         }
        System.out.println(sum);

        System.out.println();

         //2.yol


        int a = 6841;
        int toplam = 0;

        for(int m = a; m>0; m/=10){
            toplam = toplam + m%10;
        }
        System.out.println(toplam);//19


    }//main
}//class
