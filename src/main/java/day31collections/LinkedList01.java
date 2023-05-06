package day31collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    /*
    1)İnterface lerden object olusturulamaz, cunku interface lerin constructer i yoktur
    2)Abstract class larda object olusturulamaz, constructer i vardir ama constructer object olusturmada kullanilamaz
    3)interface lerin constructer lari olmadıgından collection olustururken interface isimleri new keyword unden sonra
    kullanilamaz
    4)class ==> chid ---> extends
      class ==> interface --> implements
      interface ==> interface --> extends
      interface ==> class ---> mumkun degil

Note: ArrayLists'ler eleman ekleme ve eleman silme konusunda başarısızdırlar.
Bu yüzden yapılacak application'da fazlaca eleman eklenip çıkarılacaksa ArrayList kullanılması tavsie edilmez.
Java Bu tarz işlemler için LinkedList'i oluşturmuştur.
LinkedList index kullanmadığı için eleman ekleme ve çıkarma işlemini oldukça kolay yapar.

     */
    //LINKEDLIST lerde eleman kelimesi yerine "NODE" denir. LinkedList bas Node manasinda "HEAD",
    // son Node "TAIL" denir.

    //LinkedList’ler index kullanmadiklarindan eleman silmede ve eklemede re-index yapilmasina gerek yoktur.
    // Bu da LinkedList’leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve
    // silmenin cok yapilmasi gereken durumlarda LinkedList kullanmak tavsiye edilir.

    //LinkedList’lerde search isle zor yapilir. Cunku LinkedList’ler index kullanmaz, index kullanmayinca herhangi
    // bir elemani bulmak en bastan butun elemanlar kontrol edilir, bu da cok fazla is demektir.


    public static void main(String[] args) {
        List<String> citynames = new LinkedList<>();

        LinkedList<String> names = new LinkedList<>();
        names.add("Steve");
        names.add("Carl");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");
        System.out.println(names);

        names.addFirst("Cuneyt");
        System.out.println(names);

        names.addLast("Ajda");
        System.out.println(names);

        names.add(3, "Nuran");
        System.out.println(names);

        names.remove("Ajda");
        System.out.println(names);

        //remove() ile peek() arasındaki fark ==> remove() ->remove siler ve gosterir   peek()-> gosterir silmez
        names.remove(4);
        System.out.println(names);// [Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda]

        names.add("Suleyman");
        names.add("Suleyman");
        System.out.println(names);// [Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda, Suleyman, Suleyman]

        String r1 = names.remove();//Retrieves and removes the first element of this list.
        System.out.println(r1);//Cuneyt
        System.out.println(names);// [Steve, Suleyman, Raj, Brandon, Ajda, Suleyman, Suleyman]

        names.removeFirstOccurrence("Suleyman");
        System.out.println(names);// [Steve, Raj, Brandon, Ajda, Suleyman, Suleyman]

        names.removeLastOccurrence("Suleyman");
        System.out.println(names);// [Steve, Raj, Brandon, Ajda, Suleyman]
        //Retrieves, but does not remove, the first element of this list.(Copy + Paste)
        //Returns: the head of this list, or null if this list is empty
        //Ilk elemani silmeden size verir
        String r2 = names.peek();
        System.out.println(r2);//Steve
        System.out.println(names);// [Steve, Raj, Brandon, Ajda, Suleyman]


        //Retrieves and removes the head first element of this list.(Cut + Paste)
        //Returns:the head of this list, or null if this list is empty
        //remove() bos LinkedList'te kullanilirsa "hata verir", poll() bos LinkedList'te kullanilirsa "null" verir.
        names.poll();


        //Pop removes and returns the first element of this list.(Cut + Paste)
        //This method is equivalent to removeFirst().
        names.pop();

    }
}
