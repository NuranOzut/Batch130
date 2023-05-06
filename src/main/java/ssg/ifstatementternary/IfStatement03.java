package ssg.ifstatementternary;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // 	Ornek:  	gun=Pazar output = “Hafta sonu”
        //		gun=Sali output = “Hafta ici”
        //	*** String icin equals method’unu kullanin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi = scan.next().toLowerCase();
        /*
        if (gunIsmi.equals("pazar")) {
            System.out.println("Hafta sonu");
        }
        if (gunIsmi.equals("pazartesi")) {
            System.out.println("Hafta ici");
        }
        if (gunIsmi.equals("sali")) {
                System.out.println("Hafta ici");
        }
        if (gunIsmi.equals("carsamba")) {
            System.out.println("Hafta ici");
        }
        if (gunIsmi.equals("persembe")) {
            System.out.println("Hafta ici");
        }
        if (gunIsmi.equals("cuma")) {
            System.out.println("Hafta ici");
        }
        if (gunIsmi.equals("cumartesi")) {
            System.out.println("Hafta sonu");
        }
        */

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumatesi")) {
            System.out.println("hafta sonu");
        } else {
            System.out.println("hafta ici");
        }

        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") ||
                gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") ||
                gunIsmi.equals("cuma")) {
            System.out.println("hafta ici");
        }else{
            System.out.println("hafta sonu");
        }


    }
}
