package advanced_practice.practice06;

import java.util.Scanner;

public class Q03_RastgeleSifreOlusturma {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip
        // rastgele şifre üreten bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("karakter sayisi giriniz");
        int karakterSayisi= input.nextInt();
        int sayac=0;
        String sifre="";

        String karakterler ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int maxIndex=karakterler.length();

        while (sayac<karakterSayisi){

            int rastgeleIndex= (int) (Math.random()*maxIndex);
           sifre+= karakterler.charAt(rastgeleIndex);
           sayac++;

        }
        System.out.println("sifre= "+ sifre);
    }
}
