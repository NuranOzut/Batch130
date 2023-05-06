package day02datatypesmethodcreation;

import java.util.Scanner;

public class MethodCreation01 {

     /*
                Java'da method nasil olusturulur?

                1)main method'un disinda olusturulur
                2)Access Modifier + Return Type + Method Ismi + () + {}

                Olusturulan method'lar nasil kullanilir?
                1)main method'un icinden kullanilir
                2)method'un ismini + () yazin
                3)Islem yapacaginiz sayilari parantezin icine koyun
         */

    public static void main(String[] args) {

        int sonuc = add(30, 50);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(3, 6);
        System.out.println(carpmaSonucu);

        int ucluSonuc = firstTwoMultiplyThirdAdd(2, 5, 8);
        System.out.println(ucluSonuc);

        double kup = getCube(5);

        System.out.println(kup);

    }

    public static int add(int a, int b){
        return a+b;
    }

    protected static long multiply(int a, int b){
        return a*b;
    }

    //Ornek 1: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
        return a*b+c;
    }

    //Ornek 2: Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz.
    //Note: Access Modifier'i default yapmak access modifier'i yazmayiniz
    static double getCube(double a){
        return a*a*a;
    }

    //Dikdirtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz

    public static int dikdortgenAlani(int a, int b){

        return a*b;
    }

    //dikdörtgenin çevresini hesaplayan method'u oluşturunuz.

    private static int rectangle(int a, int b){

        return 2*a+2*b;
    }

    //dairenin alanini hesaplayan method'u oluşturunuz.

    public static double cicleArea(double r){

        return Math.PI*r*r;
    }

    //dairenin cevresini hesaplayan method'u oluşturunuz.

    static double circleCev(double r){

        return 2*Math.PI*r;
    }

    //ucgenin alanini hesaplayan method'u oluşturunuz.
    private static int ucgen(int a, int h){

        return a*h/2;
    }

    //karenin alanini hesaplayan method'u oluşturunuz.
    public static int kare(int a){

        return a*a;
    }

} // class

