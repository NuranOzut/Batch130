package Gulce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q07_ortalamaUstuOgrenciler {
    public static void main(String[] args) {


    // Bir öğretmenden girmek istediği kadar notu
    // alınız, ve ortalamayı geçen öğrenci sayısını bulunuz.
        Scanner input =new Scanner(System.in);
        List<Integer> notlar = new ArrayList<>();
        String karar;
    int sayac=0;
    do {
        sayac++;
        System.out.println(sayac+". notu gırınız");
        notlar.add(input.nextInt());
        System.out.println("cıkmak için H ye basıınz,daha fazla" +
                " not girmek için herhangi bir karakter giriniz ");
       karar=input.next();
    }while (!karar.equalsIgnoreCase("h"));
        System.out.println("notlar = " + notlar);
    double toplam =0;
        for (double w:notlar) {
            toplam +=w;
            
        }
        //ortalama hesaplama
    double ortalama = toplam/notlar.size();
        System.out.printf("ortalama= "+"%.2f",ortalama);
        System.out.println();
        //ortalama üstü not sayısı
        double ortalamaUstuNotSayısı=0;
        for (double w:notlar) {
            if (w>ortalama)
                ortalamaUstuNotSayısı++;
        }
        System.out.println("ortalamaUstuNotSayısı = " + ortalamaUstuNotSayısı);
}
}
