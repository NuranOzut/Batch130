package Gulce;

import java.util.Scanner;

public class Q02_Switch_AyGunlerii {
    public static void main(String[] args) {
        /*
       Girilen yıl ve ay numarasına göre ayın kaç gün olduğunu yazdıran bir kod yazınız.
       Girdi yıl: 2000 ay: 2
       Çıktı: 29
         */

        Scanner input = new Scanner(System.in);
        System.out.println("yılı gırınız");
        int yıl =input.nextInt();
        System.out.println(" ay numarasını gırınız");
        int ay =input.nextInt();


        switch (ay){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("girdiğiniz ayın gün sayısı 31");
                break;
            case 4: case 6: case 9 : case 11:
                System.out.println("girdiğiniz ayın gün sayısı 30");
                break;
            case 2:
                if (yıl%4==0 && yıl%100==0 || yıl%400==0){
                    System.out.println("girdiğiniz ayın gün sayısı 29");
                }else{
                    System.out.println("girdiğiniz ayın gün sayısı 28");
                }
        }

    }

}
