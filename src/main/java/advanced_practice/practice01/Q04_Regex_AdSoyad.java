package advanced_practice.practice01;

import java.util.Scanner;

public class Q04_Regex_AdSoyad {

    public static void main(String[] args) {
        
        /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */
        // "\\s" bir bosluk "\\s+" bir veya birden fazla bosluk anlamina gelir.
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinzi aralarinda bosluk olacak sekilde giriniz");
        String adSoyad= input.nextLine().replaceAll("[^a-zA-Z ]", "").replaceAll("\\s+", " ").trim().toLowerCase();
        System.out.println("adSoyad = " + adSoyad);
        String ad = adSoyad.split(" ")[0];
        String soyad = adSoyad.split(" ")[1];
        String adİlkHarf = ad.substring(0,1).toUpperCase();
        String soyadİlkHarf = soyad.substring(0,1).toUpperCase();
        System.out.println("adİlkHarf = " + adİlkHarf);
        System.out.println("soyadİlkHarf = " + soyadİlkHarf);
        String adFormatli = adİlkHarf+ad.substring(1);
        String soyadFormatli = soyadİlkHarf+soyad.substring(1);
        System.out.println("adFormatli = " + adFormatli);
        System.out.println("soyadFormatli = " + soyadFormatli);


    }

}
