package day18lists;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {

        //Example 1) Integer bir List olusturun, List e 5 tane eleman ekleyin, bu elemanlardan 12 yi sili

        List<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(40);


        //remove() methodu index ile kullanilirsa o index'teki elemani siler.
        //remove() methodu index ile kullanilirsa size o elemanı verir.

        /*
        1.yol
        Integer nonPrimitive = 12;
        ages.remove(nonPrimitive);
        System.out.println(ages);

        2.yol
        ages.remove((Integer)12);

        3.yol
        ages.remove(Integer.valueOf(12));
         */
        //4.yol
        ages.remove(ages.indexOf(12));


        //Example 2:Integer bir list olusturunuz.
        // List'e 5 tane eleman ekleyiniz
        // Bu elemanlardan 12'yi siliniz.

        List<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);

        List<Integer> silinecekler = new ArrayList<>();
        silinecekler.add(12);
        nums.removeAll(silinecekler);
        System.out.println(nums);

        //removeAll() kullanmak icin yeni bir array olusuturup silmeyi
        // dusunduklerimizi onun icine koymamiz gerekiyor


    }
}
