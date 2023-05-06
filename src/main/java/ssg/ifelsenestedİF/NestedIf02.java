package ssg.ifelsenestedİF;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {

        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz :" + "erkek ise e " + "kadin ise k");
        System.out.println("Lutfen yasinizi giriniz");
        char cinsiyet = input.next().toLowerCase().charAt(0);
        int yas = input.nextInt();


        if (cinsiyet == 'k') {
            if (yas < 0 || yas > 100) {
                System.out.println("Lutfen gecerli bir yas giriniz");
            } else if (yas < 60) {
                System.out.println("emekli olamazsin "+(60-yas)+ " yil daha calisman gerek");
            } else
                System.out.println("emekli olabilirsin");

        } else if (cinsiyet == 'e') {
            if (yas < 0 || yas > 100) {
                System.out.println("Lutfen gecerli bir yas giriniz");
            } else if (yas < 65) {
                System.out.println("emekli olamazsin "+(65-yas)+ " yil daha calisman gerek");
            } else
                System.out.println("emekli olabilirsin");

        } else
            System.out.println("Lutfen sadece k yada e giriniz");


    }



}






