package LambdaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda03 {
    public static void main(String[] args) {


        Apartman da01=new Apartman("dogu",1,7000);
        Apartman da02=new Apartman("bati",2,10000);
        Apartman da03=new Apartman("guney",3,12000);
        Apartman da04=new Apartman("dogu",5,15000);
        List<Apartman> daireler= new ArrayList<>(Arrays.asList(da01,da02,da03,da04));

        System.out.println(tumDaireKira5000denBuyukİseTrue(daireler));
        System.out.println("**********");
        System.out.println(dairelerdenEnAzBirininKatSayisi2İseTrue(daireler));
        System.out.println("**********");
        System.out.println(dairelerdenCephesiDoguOlanlarinSayisi(daireler));
        System.out.println("**********");
        System.out.println(daireleriKatSayisinaGoreBuyuktenKucugeSiralayiniz(daireler));
        System.out.println("**********");
        System.out.println(katSayisi2denFazlaOlanDaireleriKirayaGoreBuyKucuSirala(daireler));
        System.out.println("**********");
        System.out.println(katSayisi3denAzOlanKiraGoreKucBuySiralaEnKucukKiraYazdir(daireler));
        System.out.println("**********");






    }

    // SORU1: Tüm dairelerin kira'ları 5000'den buyuk ise return ederek True yazdırın

    public static Boolean tumDaireKira5000denBuyukİseTrue(List<Apartman>daireler){
        Boolean sonuc=daireler.stream().allMatch(t->t.getKira()>5000);
        return sonuc;
    }

    // SORU2: Dairelerden En Az Birinin katSayisi 2 ise return ederek True yazdırın

    public static Boolean dairelerdenEnAzBirininKatSayisi2İseTrue(List<Apartman>daireler){
        Boolean sonuc=daireler.stream().anyMatch(t->t.getKatSayi()==2);
        return sonuc;
    }

    //SORU3: Dairelerden cephesi 'dogu' olanların, sayısını return ederek yazdırınız.

    public static long dairelerdenCephesiDoguOlanlarinSayisi(List<Apartman>daireler){
        long sonuc= daireler.stream().filter(t->t.getCephe().contains("dogu")).count();
        return sonuc;
    }

    //SORU4: Daireleri, katSayisina göre buyukten kucuge sıralayınız.
    // List halinde return ederek yazdırınız.

    public static List<Apartman> daireleriKatSayisinaGoreBuyuktenKucugeSiralayiniz(List<Apartman>daireler){
        List<Apartman> sonuc=daireler.stream().sorted(Comparator.comparing(Apartman::getKatSayi).reversed()).collect(Collectors.toList());
        return sonuc;
    }

    //SORU5: katSayisi 2'den fazla olan daireleri, kiraya gore buyukten kucuge sıralayınız
    // en buyuk kira'sını list halinde return ederek yazdırınız.

    public static List<Integer> katSayisi2denFazlaOlanDaireleriKirayaGoreBuyKucuSirala(List<Apartman>daireler){
        List<Integer> sonuc=daireler.stream().filter(t->t.getKatSayi()>2).sorted(Comparator.comparing(Apartman::getKira).reversed()).
                limit(1).map(t->t.getKira()).collect(Collectors.toList());
        return sonuc;
    }

    //SORU6: katSayisi 3'den az olan daireleri, kiraya gore kucukten buyuge sıralayınız
    // en kucuk kira'sini list halinde return ederek yazdırınız.

    public static List<Integer> katSayisi3denAzOlanKiraGoreKucBuySiralaEnKucukKiraYazdir(List<Apartman>daireler){
        List<Integer> sonuc= daireler.stream().filter(t->t.getKatSayi()<3).sorted(Comparator.comparing(Apartman::getKira)).
                limit(1).map(t->t.getKira()).collect(Collectors.toList());
        return sonuc;
    }










}
