package practice.practiceDTNT;

import java.util.Scanner;

public class C03_Ternary {



    public static void main(String[] args) {
        /*
        Kullancidan pozitif bir tam sayi girmesini isteyin
        Girilen tam sayi uc basamakli ise ekrana "3 Basamakli" yazidirin
        3 basamaklşi degilse cift olup olmadigini kontrol edin
        cift ise "3 Basamakli olmayan cift sayi" yazdirin
        cift degil ise " 3 Basamakli olmayan tek sayi" yazdirin
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = input.nextInt();


        //1. yol

        boolean sifirdanBuyukUcBas = sayi>99 && sayi<1000;
        boolean sifirdanBuyukUcBasOlmayanCift = !(sayi>99 && sayi<1000) && sayi %2 ==0;

        if(sayi>0) {

            if (sifirdanBuyukUcBas) {
                System.out.println("Uc Basamakli");
            } else if (sifirdanBuyukUcBasOlmayanCift) {
                System.out.println("Uc Basamakli olmayan cift sayi");
            } else
                System.out.println("Uc Basamakli olamayan tek sayi");
        }else {
            System.out.println("Lutfen pozitif bir tamsayi giriniz");
        }

        //2. yol

        boolean sifirdanBuyukUcBasTer = sayi>99 && sayi<1000;
        boolean sifirdanBuyukUcBasOlmayanCiftTer = !(sayi>99 && sayi<1000) && sayi %2 ==0;

        String sonuc = sayi>0   ? sifirdanBuyukUcBasTer ? ("3 Basamaklı"):sifirdanBuyukUcBasOlmayanCiftTer ? ("3 Basamakli olmayan cift sayi"): ("3 Basamakli olmayan tek sayi"):
                ("Lutfen pozitif bir tamsayi giriniz");
        System.out.println(sonuc);




    }





}