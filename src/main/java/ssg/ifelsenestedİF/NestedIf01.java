package ssg.ifelsenestedİF;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        // bir kisinin kan bagisinda olup olmadigini control ediniz .
        // yas:18 baslamali
        // kilo : 50 dan ust olmali
        //Yaş ve kilo için iki değişken oluşturma

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        System.out.println("Lutfen kilonuzu giriniz");

        int yas = scan.nextInt();
        double kilo = scan.nextDouble();

        if(yas>=18){
            if(kilo>50){
                System.out.println("Kan bagisinda bulunabilir");
            }else
                System.out.println("Kan bagisinda bulunamaz");
        }else{
            System.out.println("Yas 18den buyuk olmali");
        }


















    }
}
