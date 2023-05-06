package ssg.ifelsenestedİF;

import java.util.Scanner;

public class IfElse01 {
    public static void main(String[] args) {
        // girilen bir karakterin, harf olup olmadigini bulalim
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter = scan.next().toUpperCase().charAt(0);

        if(karakter>='A'&& karakter<='Z'){
            System.out.println("Girdiginiz karakter bir harf ");
        }else{
            System.out.println("Girdiginiz karakter bir harf degil");
        }








    }



}
