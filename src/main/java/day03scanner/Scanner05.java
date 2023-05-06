package day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        //Kullanicidan bir dikdörtgenin iki kenar uzunlugunu aliniz
        //İ)Alanini hesaplayiniz ==> Kısa kenar * Uzun kenar
        //ii)Cevresini hesaplayiniz ==> 2*Kısa kenar + 2*Uzun kenar

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz...");
        float shortSide = input.nextFloat();

        System.out.println("Dikdortgenin uzun kenar uzunlugunu giriniz...");
        float longSide = input.nextFloat();

        System.out.println("Alan = " + (shortSide * longSide));
        System.out.println("Cevre = " + (2*shortSide + 2*longSide));





    }
}
