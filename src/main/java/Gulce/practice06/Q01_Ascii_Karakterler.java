package Gulce.practice06;

import java.util.Scanner;

public class Q01_Ascii_Karakterler {
    //kullanıcıdan aldıgınız iki karakterin arasındaki tüm karakterlei yazdıran kod yazınız.
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("ilk karakteri giriniz.");
        char ch1 = input.next().charAt(0);
        System.out.println("ikinci karakteri giriniz.");
        char ch2 = input.next().charAt(0);

    int ilk = Math.min(ch1,ch2);
    int son = Math.max(ch1,ch2);
        for (int i = ilk+1; i <son ; i++) {
            System.out.print((char) i+" ");

        }

    }
}


