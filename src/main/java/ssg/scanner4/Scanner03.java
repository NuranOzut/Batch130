package ssg.scanner4;

import java.util.Scanner;

public class Scanner03{

    public static void main(String[] args) {

        //  Kullanıcıdan ad, ikinci ad, soyadı, SSN’yi alın ve ardından aşağıdaki gibi yazdırın
        //Ali Mert Can
        //kkno:123456789

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String isim = input.next();
        System.out.println("Lutfen ikinci adinizi giriniz");
        String isim2 = input.next();
        System.out.println("Lutfen soyadinizi giriniz");
        String soyisim = input.next();
        System.out.println("Lutfen kkno giriniz");
        int kkno = input.nextInt();

        System.out.println(isim + " "+ soyisim +" "+ soyisim);
        System.out.println("kkno : "+ kkno);



    }
}
