package advanced_practice.practice01;

import java.util.Scanner;

public class Q6_WhileLoop_IlkVeSonRakam {

    public static void main(String[] args) {

        //Kullanıcıdan alınan bir sayının ilk ve son rakamlarını toplayan bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = input.nextInt();

        //1.Yol

        int sonRakam = sayi%10;
        System.out.println("son rakam = " + sonRakam);
        int ilkRakam = sayi;

        while (ilkRakam>9){
            ilkRakam /= 10;
        }
        System.out.println("ilk rakam = " + ilkRakam);
        System.out.println("Toplam = " +(ilkRakam+sonRakam));

        //2.Yol

        String sayiString=String.valueOf(sayi);
                int strIlkRakam= Integer.parseInt(sayiString.substring(0,1));
                int strSonRakam =Integer.parseInt(sayiString.substring(sayiString.length()-1));

        System.out.println("Toplam = " + (strIlkRakam+strSonRakam));





    }
}
