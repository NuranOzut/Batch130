package day33maps;

import java.sql.SQLOutput;
import java.util.*;

public class HashMaps01 {
    public static void main(String[] args) {

        /*
        sozluk yapisi map'a benzer
solda kelime, sagda aciklamasi vardir
soldakiler tekrarli olamaz sagda tekrar olabilir
map te boyledir soldakiler Unique (yunik) olacak sag taraf tekrarli olabilir
de olmayapilir repeatedly (tekrarli) olabilir
cat = evcil hayvan
dog = evcil hayvan
crocodile = timsah
tiger = kaplan
solda data sagda data
map deyince sozluk akla gelsin
sola unique lere key tekrarli olabilen sagdaki data lara value denir

map te bir data stractir dir
depolarken bu yapiya ihtiyac varsa map kullaniriz
mesela ulkeler ve nufuslarini depolamamiz lazim burda sol unique sag tekrarli olabilir burda
map kullaniriz
mesela okul app imiz var ogrencilerin karne ort ni depolayacagiz sol unique sa[ tekrarli
olabilir burda map kullanilmalidir

 1) Map'lerde "USA = 400,000,000" seklinde data depolamamiz gerektiginde kullanilir.
  2) "USA = 400,000,000" datasinin "USA" kismi "key" olarak adlandirilir ve key'ler "unique" dir
  3) "USA = 400,000,000" datasinin "400,000,000" kismi "value" olarak adlandirilir ve value'lar "tekrarli" olabilir.
  4) "HashMap" cok hizlidir cunku "HashMap" ler siralama ile ugrasmazlar.
  5) "Entry" ler "unique" dir cunku key kisimlari unique oldugundan her bir "Entry" digerlerinden farklidir.
6) "HashMap" cok hizlidir cunku "HashMap" ler "entry" leri siralamak ile ugrasmazlar.
7) "HashMap" lerde bir tane "key" i "null" yapabilirsiniz.
8) "HashMap" lerde birden fazla "value" yu "null" yapabilirsiniz.
9) "HashMap" ler "multi thread" icin kullanilamaz ve "synchronization" yoktur.
         */

//HashMap nasil olusturulur?
        HashMap<String, Integer> hm = new HashMap<>();
        System.out.println(hm);//{}

//HashMap'lere nasil entry eklenir?
        hm.put("USA", 400000000);
        hm.put("Germany", 83000000);
        hm.put("Albania", 3000000);
//Ayni key'i kullanarak yeni bir entry eklerseniz var olan "value" u update etmis olursunuz.
        hm.put("Albania", 2800000);
        hm.put(null, 12000000);
        hm.put(null, 18000000);
        hm.put("Myanmar", null);
        hm.put("Bhutan", null);
        System.out.println(hm);//{null=18000000, Myanmar=null, USA=400000000, Bhutan=null, Germany=83000000, Albania=2800000}

//HashMap'lerde sadece key leri almak icin
        Set<String> hmKeys = hm.keySet();
        System.out.println(hmKeys);
        //HashMap'lerde sadece "value" lari almak istiyorum
        //Example 1) hm Map indeki ulkelerin toplam nufusunu bulunuz

        Collection<Integer> hmValues = hm.values();
        int sum = 0;
        for (Integer w : hmValues) {
            if (w != null) {
                sum = sum + w;
            }
        }
        System.out.println(sum);

        //HashMap'lerde belirli bir key in value sini nasil alabiliriz
        Integer usaPopulation = hm.get("USA");
        System.out.println(usaPopulation);

        hm.replace("Bhutan", 35000000);
        System.out.println(hm);

        hm.putIfAbsent("USA", 700000000);
        System.out.println(hm);

        //Hashmap lerde putIfAbsent() methodu  entry varsa birsey yapmaz, yoksa yeni entry olusturur.

        hm.putIfAbsent("India", 700000000);
        System.out.println(hm);

        //Example 2: Yeni ogretmenin maasi standart ucretten 1000TL fazla, eski ogretmenin maasi standart ucretten 2000TL fazla olsun
        HashMap<String, Integer> salaries = new HashMap<>();

        salaries.put("Ali", 8000);
        salaries.put("Ayse", 5000);
        salaries.put("Veli", 9000);
        salaries.put("Tom", 9900);

        String teacherName = "Kemal";
        salaries.putIfAbsent(teacherName, 1100);
        salaries.put(teacherName, 12000);
        System.out.println(salaries);

        //getOrDefault() olan key'lerin degerini verir, olmayan key'ler icin de sizin ikinci parametreye yazdiginiz degeri verir
        Integer r = hm.getOrDefault("Bhutan", 0);
        System.out.println(r);

        //entrySet() methodu "Map" i "Set" e cevirir.
        //Setlerin methodlarini kullanabilmek icin entrySet() methodunu kullanarak Map'i Set'e cevirebiliriz.
        Set<Map.Entry<String, Integer>> myEntries = hm.entrySet();
        System.out.println(myEntries);

        //Example 3: Ulke ismindeki character sayisini ulke nufusuna ekleyen ve sonucu console'a yazdiran code u yaziniz

        //[null=18000000, Myanmar=null, USA=500000000, Bhutan=35000000, Germany=83000000, Albania=2800000, India=700000000]
        for(Map.Entry<String,Integer> w : myEntries){

            if(w.getValue()!=null && w.getKey()!=null) {
                int toplam = w.getValue() + w.getKey().length();
                System.out.println(toplam);
            }
        }
    }
}