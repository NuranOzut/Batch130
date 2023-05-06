package day03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Iki sayi giriniz");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);


    }
    /*

    Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
    double ilkSayi = input.nextDouble();
    double ikinciSayi = input.nextDouble();

    double sonuc1 = (ilkSayi + ikinciSayi);
    double sonuc2 = (ilkSayi - ikinciSayi);
    double sonuc3 = (ilkSayi * ikinciSayi);
    double sonuc4 = (ilkSayi / ikinciSayi);

        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
        System.out.println(sonuc4);

     */




    }
