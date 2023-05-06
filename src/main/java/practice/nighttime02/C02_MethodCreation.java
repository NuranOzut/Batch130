package practice.nighttime02;

import java.sql.SQLOutput;

public class C02_MethodCreation {

    public static void main(String[] args) {

        //Dikdortgenin alanini hesaplayan kodu yaziniz ve kullaniniz

        System.out.println("Dikdortgenin Alani"+ dikdortgenAlani(10, 5));

        System.out.println("DikdortgeninCevresi" +dikdortgenCevresi(10,5));

        kareninAlani(25);


    }//main

    /*
             Access     static      dataType  methodismi(parametreler)
             modifier

     */
              public     static        int dikdortgenAlani(int a, int b){
                     return a*b;//carpmanin sonucunu kullaniciya verdim


    }//methodBody

         //Dikdortgenin cevresini hesaplayan kodu yaziniz ve kullaniniz

              public static int dikdortgenCevresi(int a, int b){
                  return 2*(a+b);

    }//methodBody

         //Karenin alanini hesaplatan kodu yaziniz

           public static void kareninAlani(int a){
               System.out.println("Karenin Alani" + (a*a));


           }//methodBody




}//class
