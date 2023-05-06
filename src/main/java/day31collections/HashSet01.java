package day31collections;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        //hash bır teknıktır bız bu teknıgı kullanarak unıq datalar uretırız.
        //datalar tekrarlı olabılır ama hash kodlar tekrarlı olamaz
        //"Set" demek tekrarsız data depolamak icin kullanilan bi collectiondir.ArrayList ve LinkedListlerde tekrar mümkündür.
        //Ancak Set tekrar kabul etmez. Yani tekrarsız veriler için kullanılır.

        //Collections'lari coklu eleman depolamak icin kullaniriz
        //Hash bir tekniktir biz bu teknigi kullanarak unique data'lar uretiriz (Benzersiz)
        //Mesela universitenin olusturdugu ogrenci numarasi olusturma islemine hash code islemi denir
        //IT de set kelimesini duyarsaniz tekrar yok demektir
        //Mesela e-mail depolayan bir DB icin HashSet en iyisidir

        //HashSet, Java'da bir veri yapısıdır. Bu yapı, bir küme olarak düşünülebilir ve içinde saklanan elemanlar benzersiz
        // olmalıdır. HashSet, HashMap yapısına benzer şekilde çalışır ve elemanların benzersizliğini sağlamak için hash
        // kodları kullanır. Bu yapı, arama, ekleme ve silme işlemlerini hızlı bir şekilde gerçekleştirmek için tasarlanmıştır.

        //"Set" ler 3'e ayrilir;
        //  i)HashSet: a)Super hizlidir,cunku HashSet'ler verdiginiz elemanlari siralamak icin zaman kaybetmez
        //             yani HashSet'lere eklenen elemanlar rastgele siralanirlar.
        //             b)HashSet'ler tekrarli elemana musaade etmezler
        //             c)HashSet'ler sadece bir tane "null" i eleman olarak kabul ederler.
        //  ii)LinkedHashSet: a)LinkedHashSet elemanlari "insertion order" a gore dizer.
        //                    b)LinkedHashSet elemanlari siralamakta zaman kaybettigi icini HashSet' e gore yavastir.
        //                    c)tekrarli elemana musaade etmezler
        //  iii)TreeSet: a)TreeSet elemanlari "natural order"(kucukten buyuge || alfabetik sıraya gore) a gore dizer.
        //               b)TreeSet "natural order" yaparken cok zaman harcar o yuzden en yavas "Set" dir.
        //               c)tekrarli elemana musaade etmezler


        HashSet<Integer>hs=new HashSet<>();
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);
        System.out.println(hs);

        int hc = hs.hashCode();
        System.out.println(hc);



    }
}
