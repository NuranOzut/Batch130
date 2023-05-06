package Gulce;

import java.util.Arrays;
import java.util.Scanner;

public class Q04_Anagram {
    public static void main(String[] args) {
        /*
        İki kelimenin "Anagram" olup olmadığını kontrol eden bir method
        oluşturunuz.
        - Anagram, başka bir kelimenin karakterlerinden yeni bir
        kelime oluşturmaktır. -
        Örn:
        * bahriyeli <> harbiyeli.
        * sızlanma <> anlamsız.
        * asya <> yasa.
        * Bursa Dağı <> su bardağı
        * kan ara <> Ankara.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci String değeri giriniz");
        String birinci =    input.nextLine();
        System.out.println("İkinici String değeri giriniz");
        String ikinici =    input.nextLine();

        anagram(birinci,ikinici);
    }


    public static void anagram(String str1, String str2) {

        String arr1[] = str1.toLowerCase().replaceAll(" ", "").split("");
        String arr2[] = str2.toLowerCase().replaceAll(" ", "").split("");

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));// sıraladık

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));// sıraladık

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("anagram");
        } else {
            System.out.println("anagram değil");
        }


    }
}
