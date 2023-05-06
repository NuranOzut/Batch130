package ssg.scanner4;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        //Kullanıcıdan bir tamsayı girmesini iste ve ardından
        // tamsayı çift ise “Çift” yazsin
        // tamsayı tek ise “Tek” yazsin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = input.nextInt();

        if(sayi%2==0){
            System.out.println("Cift");
        }else if(sayi%2!=0){
            System.out.println("Tek");
        }else {
            System.out.println("Lutfen gecerli bir sayi giriniz");
        }


    }
}
