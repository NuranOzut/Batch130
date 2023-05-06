package ssg.scanner4;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //  uzunluk, genişlik, yükseklik olan dikdörtgenler prizmasının hacmini hesaplayan bir program yazıniz
        // İpucu: dikdörtgenin hacmi= width*height*length;

        Scanner input = new Scanner(System.in);
        System.out.println("uzunlugu giriniz");
        int uzunluk = input.nextInt();

        System.out.println("genislik giriniz");
        int genislik = input.nextInt();

        System.out.println("yuksekligi giriniz");
        int yukseklik = input.nextInt();

        System.out.println("dikdortgenler prizmasinin hacmi : " + uzunluk*genislik*yukseklik);


    }

    public static int dikdortgenlerprizmasininhacmi (int uzunluk, int genislik, int yukseklik){
        return uzunluk*genislik*yukseklik;

    }
}
