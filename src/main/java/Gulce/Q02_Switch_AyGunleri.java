package Gulce;

import java.util.Scanner;

public class Q02_Switch_AyGunleri {

    /*
       Girilen yil ve ay numarasına göre ayin kaç gün olduğunu
       yazdiran bir kod yazınız.
       Girdi yıl: 2000 ay: 2
       Çıktı: 29
        */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("yılı gırınız");
        int yil = input.nextInt();
        System.out.println("ay numarasını gırınız");
        int ay = input.nextInt();

        switch (ay){
            case 1: case 3: case 5: case 7: case 8 : case 10: case 12:
                System.out.println("gırdınız ayın gun sayısı 31");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("gırdıgınız ayın gun sayısı 30");
                break;
            case 2:
                if (yil%4== 0 && yil%100!=0 || yil%400==0 ){
                    System.out.println("gırdıgınız ayın gun sayısı 29");
                }else{
                    System.out.println("gırdıgınız ayın gun sayısı 28");
                }
                break;
            default:
                System.out.println("geçerli bir ay numarası gırınız");
        }



    }
}
