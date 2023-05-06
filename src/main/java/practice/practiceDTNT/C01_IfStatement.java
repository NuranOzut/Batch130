package practice.practiceDTNT;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        /*

        Kullanicidan bir gun ismi alin
        Eger gun cuma ise "Muslumanlar Icin Mubarek Gun" ;
        Eger gun cumartesi ise "Yahudiler Icın Kutsal Gun" ;
        Eger pazar ise "Hristiyanlar Icın Kutsal Gun"
        yazdiran kodu olusturunuz

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String gun = input.next().toLowerCase();

        if(gun.equals("cuma")){

            System.out.println("Muslumanlar Icın Mubarek Gun");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler Icın Kutsal Gun");
        } else if (gun.equals("pazar")) {
            System.out.println("Hristiyanlar Icın Kutsal Gun");
        }else
            System.out.println("Kutsal Gun Degil");

    }
}
