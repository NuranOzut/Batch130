package day34mapsiterators;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {

    /*
    1-TreeMap entry ler "key" lere göre "natural order" a koyar.
    2-TreeMap cook yavastır cunku natural order yapmak cok zaman ister.
    3-TreeMap "trade-safe" ve "synchhronized" değildir.
    4-TreeMap lerin key lerinde null kullnılamaz ama valuelarda istedigımız kadar kullanabiliriz.

     */
    public static void main(String[] args) {
        long one = System.nanoTime();
        TreeMap<String, Integer> stdAges1 = new TreeMap<>();
        stdAges1.put("Ali", 21);
        stdAges1.put("Kemal", 19);
        stdAges1.put("Ayşe", 25);
        stdAges1.put("Murat", 22);

        System.out.println(stdAges1);
        long two = System.nanoTime();
        HashMap<String, Integer> stdAges2 = new HashMap<>();
        stdAges2.put("Ali", 21);
        stdAges2.put("Kemal", 19);
        stdAges2.put("Ayşe", 25);
        stdAges2.put("Murat", 22);

        System.out.println(stdAges2);
        long three = System.nanoTime();

        HashMap<String, Integer> stdAges3 = new HashMap<>();
        stdAges3.put("Ali", 21);
        stdAges3.put("Kemal", 19);
        stdAges3.put("Ayşe", 25);
        stdAges3.put("Murat", 22);

        System.out.println(stdAges3);
        TreeMap<String,Integer> stdAges4 =new TreeMap<>(stdAges3);
        System.out.println(stdAges4);
        long four = System.nanoTime();

        System.out.println("Treemap :"+ (two-one));
        System.out.println("Hashmap :"+ (three-two));
        System.out.println("Hashmap --> TreeMap : "+ (four-three));

    }
}
