package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

        /*

          //Example 1: Asagıdaki kurallara gore kullanicinin girdigi password u kontrol ediniz
                       i)En az 8 character olsun
                       ii)Space character i password de olmasin (! basinda)
                       iii)En az bir tane buyuk harf olsun
                       iv)En az bir tane kucuk harf olsun
                       v)En az bir tane sembol olsun
                       vi)En az bir tane rakam olsun


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz");
        String pwd = input.nextLine();

        // i)En az 8 karakter olsun
        boolean first = pwd.length()>7;

        //ii)Space character i password de olmasin
        boolean second = !pwd.contains(" ");

        //iii)En az bir tane buyuk harf olsun
        //Note: Buyuk harf olayanlari sil,
        //      Kalan karakter sayisina bak
        //      Krakter satyisi 0 ise buyuk harf yok demektir
        //      0 dan buyukse buyuk harf var demektir

        boolean third = pwd.replaceAll("[^A-Z]","").length()>0;
        //Method lari ayni satirda yan yana kullanmaya "method chain" denir

        //iv)En az bir tane kucuk harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;

        //v)En az bir tane sembol olsun
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9)]","").length()>0;

        //vi)En az bir tane rakam olsun
        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;

        System.out.println("password gecerlimi?" + (first && second && third && fourth && fifth && sixth));


    }
}
