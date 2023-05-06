package ssg.forloop;

import java.util.Scanner;

public class ForLoop07 {
    /*
   Soru 7) Kullanicidan 100'den kucuk bir tamsayi isteyin. 1'den baslayarak girilen sayiya kadar 3'un kati olan sayilari yazdirin.
   */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 100'den kucuk bir tam sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi > 100) {
            System.out.println("gecersiz sayi girdiniz lutfen 100'den kucuk bir sayi giriniz");
        } else

            for (int i = 1; i <= sayi; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
    }
}
