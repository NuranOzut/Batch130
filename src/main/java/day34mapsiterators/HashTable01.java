package day34mapsiterators;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable01 {

    /*
    1- HashTable "trade-safe" ve "synchorenized"dir.
    2-HashTable elemanları rastgele sıralar.
    3-HashTable'lar  HashMap' lere göre daha yavaştır.
    4-HashTable'lar  "key" lerde "value" larda "null" kullanılmasına müsade etmezler.
    not: 1) "Multi tread" ve sychornization kullanmanız gerekirse
         2)"key" lerde ve "value" larda "null" kullanmak yasak ise HashTable kullanmak gerekir.

     */

    public static void main(String[] args) {

        Hashtable<Integer,Integer> ht =new Hashtable<>();
        ht.put(1, 2);// 1 ve -1
        ht.put(2, 4);// 1, -1, 2, -2
        ht.put(6, 8);// 1, -1, 2, -2, 3, -3, 6, -6
        System.out.println(ht);




    }
}
