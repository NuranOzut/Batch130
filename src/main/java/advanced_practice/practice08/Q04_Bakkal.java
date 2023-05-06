package advanced_practice.practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q04_Bakkal {
    /*
        Bakkal günlük gelir programı yazınız.
     -Tüm günlerin gelirlerini gösteren bir method,
     -Haftalık gelir ortalamasını gösteren bir method,
     -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelire eşit olduğunu gösteren bir method oluşturunuz.
   */

    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"));
    static List<Double> gunlukKazanclar = new ArrayList<>();
    static  double toplamKazanc=0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gun =0;
        while (gun<7){
            System.out.println(gunler.get(gun)+" gününün kazancını giriniz");
            double kazanc =input.nextDouble();
            gunlukKazanclar.add(kazanc);
            toplamKazanc+=kazanc;
            gun++;

        }
        System.out.println("Gunluk kazanclar: "+ gunlukKazanclar);
        System.out.println("Toplam kazanc: "+ toplamKazanc);
        System.out.println("Ortalama gelir: "+ ortalamaGelir());
        System.out.println("Ortalama ustu gunler: "+ortalamaUstuGunler());
        System.out.println("Ortalama alti gunler: "+ortalamaAltiGunler());
        System.out.println("Ortalama gelirli gunler: "+ortalamaGelirliGunler());


    }

    static double ortalamaGelir(){
        return toplamKazanc/7;
    }

    static String ortalamaUstuGunler (){
        String ortalamaUstuGunler ="";
        for (int i = 0; i <7 ; i++) {
            if(gunlukKazanclar.get(i)>ortalamaGelir()){
                ortalamaUstuGunler+=gunler.get(i)+ " ";
                System.out.println();
            }

        }
        return ortalamaUstuGunler;
    }

    static String ortalamaAltiGunler (){
        String ortalamaAltiGunler ="";
        for (int i = 0; i <7 ; i++) {
            if(gunlukKazanclar.get(i)<ortalamaGelir()){
                ortalamaAltiGunler+=gunler.get(i)+ " ";
                System.out.println();
            }

        }
        return ortalamaAltiGunler;
    }
    static String ortalamaGelirliGunler (){
        String ortalamaGelirliGunler ="";
        for (int i = 0; i <7 ; i++) {
            if(gunlukKazanclar.get(i)==ortalamaGelir()){
                ortalamaGelirliGunler+=gunler.get(i)+ " ";
                System.out.println();
            }

        }
        return ortalamaGelirliGunler;
    }







}