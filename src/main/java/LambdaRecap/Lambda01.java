package LambdaRecap;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5, -8, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));

        ciftVePozitifLamExYazdir(sayi);
        System.out.println("\n*******");
        ciftVePozitifMetRef(sayi);
        System.out.println("\n*******");
        kareYazdir(sayi);
        System.out.println("\n*******");
        kareTekrarsiz(sayi);
        System.out.println("\n*******");
        buyKucSirala(sayi);
        System.out.println("\n*******");
        pozitifKupBirlerBas5(sayi);
        System.out.println("\n*******");
        toplamMetRef(sayi);
        System.out.println("\n*******");
        toplamLambdaEx(sayi);
        System.out.println("\n*******");
        System.out.println(pozitifElCarpimLamEx(sayi));
        System.out.println("\n*******");
        System.out.println(ciftElKareKucBuySirListReturn(sayi));

    }
    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak
    //       aralarında bosluk olacak sekilde yazdırın

    public static void ciftVePozitifLamExYazdir(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 == 0 && t > 0).forEach(t -> System.out.print(t + " "));
    }

    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak
    // aralarında bosluk olacak sekilde yazdırın

    public static void ciftVePozitifMetRef(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 == 0 && t > 0).forEach(Utils::yazdir);
    }

    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void kareYazdir(List<Integer> sayi) {
        //sayi.stream().map(t -> t * t).forEach(LambdaRecap.Utils::yazdir);
        sayi.stream().map(Utils::kareAlma).forEach(Utils::yazdir);
    }
    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın

    public static void kareTekrarsiz(List<Integer> sayi) {
        sayi.stream().distinct().map(Utils::kareAlma).forEach(Utils::yazdir);

    }
    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın

    public static void buyKucSirala(List<Integer> sayi) {
        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils::yazdir);

    }
    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı
    // 5 olanları yazdırınız

    public static void pozitifKupBirlerBas5(List<Integer> sayi) {
        sayi.stream().filter(t -> t > 0).map(t -> t * t * t).filter(t -> t % 10 == 5).forEach(Utils::yazdir);
    }
    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın

    public static void toplamMetRef(List<Integer> sayi) {
        Optional<Integer> sonuc = sayi.stream().reduce(Integer::sum);
        //redurce terminal method dur..Bu method dan sonra baska method kullanilamaz
        System.out.println(sonuc);
    }
    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın

    public static void toplamLambdaEx(List<Integer> sayi) {
        int sonuc = sayi.stream().reduce(0, (t, u) -> t + u);
        System.out.println(sonuc);
        /*
        Orn; reduce( 0,(t,u)->t+u) ==>  "t" ilk degeri "sifir" dan alir, daha sonraki degerleri toplamanin sonucundan alir.
"u" ise degerlerini her zaman "stream " den yani akista bize ne verilmis ise (orn List) oradan alir .
 //reduce( 0,(t,u)->t+u) burada bu codu int bir konteyner a koydugumuzda kizarmaz
 //cunku herhalukarda  "0" bir deger oldugu icin "Optional Integer" a da gerek kalmaz.
 //Aksi takdirde "0 Identity"  olmadiginda Java, Ya listte hic eleman yoksa(null ise)!!!  diye kizarir.
 //Java null i Integer kabul etmedigi icin hata verir , bunu engellemek icin java "Optional IInteger" a cevirir
         */
    }

    //SORU9 : Listin pozitif elemanlarının, carpımını Lambda Expression ile return ederek yazdırın

    public static int pozitifElCarpimLamEx(List<Integer> sayi){

       int sonuc= sayi.stream().filter(t->t>0).reduce(1,(t,u)->t*u);
        return sonuc;
    }
    //SORU10 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list
    // halinde return ederek yazdırınız

    public static List<Integer> ciftElKareKucBuySirListReturn(List<Integer> sayi){
       List<Integer> sonuc=sayi.stream().filter(t->t%2==0).map(t->t*t).sorted().collect(Collectors.toList());
       return sonuc;
    }



}
