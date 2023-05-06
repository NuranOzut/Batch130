package day34mapsiterators;

import java.util.HashMap;
/*
1-HashMap oluşturmak için  HashMap<String,Integer> hm =new HashMap<>();kodunu
yazdığımızda Java 16 tane "bucket" ve bu "bucket" 0 dan 15 e kadar indexler.
2-siz eleman eklemek icin hm.put("Istanbul",170000000); kodunu yazdıgınızda Java;
1) key icin Hashcode üretir.
2)Hashcode u 16 ya böler.
3)Kalanı index olarak kullanıp indexi kalana eşt olan "bucket" a bu entryi yerleştirir.
4)"bucket" a "entry" eklenirken java "bucket" içinde "linkedlist" yapısını kullanır.
 */

public class HashMapMechanism {
    public static void main(String[] args) {

        HashMap<String,Integer> hm =new HashMap<>();
        hm.put("Istanbul",170000000);
        hm.put("Miami",5000000);
        hm.put("Moscow",18000000);
        hm.put("New Delhi",31000000);
        System.out.println(hm);


    }

}
