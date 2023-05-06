package Gulce.practice06;

import java.util.Scanner;

public class Q03_rastgeleSifreolusturma {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("karakter sayısını giriniz");
        int karakterSayısı =input.nextInt();
        String karakterler ="abcdefghıjklmnoprstuvwyzABCDEFGHIJKLMNOPRSTYUVWYZ0123456789";
        int maxIndex= karakterler.length();
       int sayac=0;
       String sıfre ="";
        while (sayac<karakterSayısı){
         int rastgeleIndex =   (int)(Math.random()*maxIndex);
        sıfre +=karakterler.charAt(rastgeleIndex);
        sayac++;
        }
        System.out.println("sıfre = " + sıfre);
    }
}
