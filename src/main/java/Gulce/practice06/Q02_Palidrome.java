package Gulce.practice06;

import java.io.StringBufferInputStream;
import java.util.Scanner;

public class Q02_Palidrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("Bir String deger giriniz.");
//        String str =input.nextLine().replaceAll(" ","").toLowerCase();
//        String strReverse ="";
//        for (int i = str.length()-1; i >-1 ; i--) {
//            strReverse+=str.charAt(i);
//
//        }
//        System.out.println("strReverse = " + strReverse);
//
//        if (str.equals(strReverse)){
//            System.out.println("Palindrome");
//        }else {
//            System.out.println("Palindrome DEĞİL");
//        }

        System.out.println("Bir String deger giriniz.");
        String str2 = input.nextLine().replaceAll(" ", "").toLowerCase();
        System.out.println("str2 = " + str2);

        StringBuilder stb = new StringBuilder(str2);
        System.out.println("stb = " + stb);
        String str2Reversed = stb.reverse().toString();
        System.out.println("Reverse() sonrası stb = " + stb);

        if (str2.equals(str2Reversed)){//toStrng i direk parantez içine yazarakta kullanabiliriz.
            System.out.println("Palindrome");
        }else {
            System.out.println("Palindrome DEĞİL");
        }

    }


}
