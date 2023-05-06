package day35Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    /*
    1) Lambda functional programming' dir, digeri Structured programing dir
    2) "functional programming" = ne yapmak gerekir? ile ilgilenir. "Nasıl yapmak gerekir? ile ilgilenmez.
    3) "Functional programming" collection'lar ve Array'ler de kullanilir.
    4)  Lambda, Java ya, Java 8 ' de eklendi.
     */

    //"stream" elemanlari yukardan asagiya dizer."Lambda" list'i "stream" e cevirir öyle calisir
    //"Filter" filtrelemek icin kullanilir
    //"map method" u var olan elemani degistirmek icin kullanilir
    //"distinct method" u tekrarli elemanlari sadece 1 kez gosterir ve tekrarsizlari olduklari kadar gosterir.
    //   Note : Distinct methodu ilk baslara konulursa "Lambda" ya daha az is yaptirmis oluruz.
    //"reduce method" u  kullanildiginda cok sayidaki deger bir tane degere donusur
    //Orn; reduce( 0,(t,u)->t+u) ==>  "t" ilk degeri "sifir" dan alir, daha sonraki degerleri
    // toplamanin sonucundan alir. "u" ise degerlerini her zaman "stream" den alir .
    //get()==> methodu optional data type'ini Integer'a cevirir.
    //sorted() methodu ==> elemanlari kucukten buyuge siralar.
    //sorted(Comparator.reverseOrder())methodu ==> elemanlari buyukten kucuge siralar.

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printElements1(nums);
        System.out.println();
        printElements2(nums);
        System.out.println();
        printEvenElements1(nums);
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printSquareOfOddElements(nums);
        System.out.println();
        printCubeOfDistinctOddElements(nums);
        System.out.println();
        printSumOfSquaresOfDistinctEvenElements(nums);

        printProductOfSquaresOfDistinctEvenElements(nums);

        getMaxValue(nums);

        getMaxValue2(nums);

        getMaxValue3(nums);

        getMinValue(nums);

        getMinValue2(nums);

        getMinValue3(nums);

        getMinValue4(nums);

        getMinGreaterThanSevenEven(nums);







    }
    //1)Create a method to print the list elements on the console in the same line with a space
    // between two consecutive elements.(Structured)
    //1)Konsoldaki liste elemanlarını, ardışık iki eleman arasında boşluk bırakarak aynı satıra
    // yazdırmak için bir method oluşturun.

    public static void printElements1(List<Integer> nums) {

        for (Integer w : nums) {
            System.out.print(w + " ");
        }
    }


    //2)Create a method to print the list elements on the console in the same line with a space
    // between two consecutive elements.(functional)
    //2)Konsoldaki liste elemanlarını, ardışık iki eleman arasında boşluk bırakarak aynı satıra
    // yazdırmak için bir method oluşturun.

    public static void printElements2(List<Integer> nums) {
        nums.stream().forEach(t -> System.out.print(t + " "));
    }
    //3)Create a method to print the even list elements on the console in the same line with a
    // space between two consecutive elements.(Structured)
    // Bir List'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran methodu olusturunuz

    public static void printEvenElements1(List<Integer> nums) {
        for (Integer w : nums) {

            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }
    //4)Create a method to print the even list elements on the console in the same line with a
    // space between two consecutive elements.(functional)
    // Bir List'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran methodu olusturunuz

    public static void printEvenElements2(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));
    }

    //5)Create a method to print the square of odd list elements on the console in the same line
    // with a space between two consecutive elements.
    //Bir Listteki tek sayi olan elemanlarin karelerini ayni satirda aralarina bosluk koyarak yazdiran
    // methodu olustur functional

    public static void printSquareOfOddElements(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));
    }

    //6)Create a method to print the "cube" of "distinct" "odd" list elements on the console in
    // the same line with a space between two consecutive elements.
//  Bir list'teki "tek sayi" olan elemanlarin "kup"lerini tekrarsiz olarak ayni satirda aralarina
//  bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printCubeOfDistinctOddElements(List<Integer> nums) {
        nums.
                stream().filter(t -> t % 2 != 0).distinct().map(t -> t * t * t).forEach(t -> System.out.print(t + " "));

    }
    /*
    stream() elemanları dikey yazdırır
    filter() filtreleme yapar kurala göre
    map()    varolan elemani degıstırmek icin kullanilir(set methoduna benzer)
    distinct() tekrarsız elemanları secer
     */

    //7)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements

    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums) {
        Integer sum = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(sum);
    }

    //8)Create a method to calculate the "product" of the "square" of "distinct" "even" elements
    public static void printProductOfSquaresOfDistinctEvenElements(List<Integer> nums) {
        Integer product = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(1, (t, u) -> t * u);
        System.out.println(product);
    }

    //9)Create a method to find the "maximum value" from the list elements
    public static void getMaxValue(List<Integer> nums) {
        Integer max=nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);
    }
/*
maximum degeri ararken Integer.MIN_VALUE kullanmak genel pratiktir.
minimum degeri ararken Integer.MAX_VALUE kullanmak genel pratiktir.
 */

    //2.yol
    public static void getMaxValue2(List<Integer> nums) {

        Integer max = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);
    }
    //3.yol
    public static void getMaxValue3(List<Integer> nums) {
        Integer max=nums.stream().distinct().sorted().reduce((t, u) ->u).get();
        System.out.println(max);
    }

    //10)Create a method to find the minimum value from the list elements

    public static void getMinValue(List<Integer> nums){
        Integer min= nums.stream().distinct().reduce((t,u)->t>u ? u : t).get();
        System.out.println(min);
    }

    //2.Yol
    public static void getMinValue2(List<Integer> nums){
        Integer min= nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t,u)->u).get();
        System.out.println(min);
    }

    //3.Yol
    public static void getMinValue3(List<Integer>nums){
        Integer min=  nums.stream().distinct().sorted().reduce((t,u)->t).get();
        System.out.println(min);
    }

    //4.Yol
    public static void getMinValue4(List<Integer>nums){
        Integer min=nums.stream().distinct().reduce((t,u)->Math.min(t,u)).get();
        System.out.println(min);

    }
    //11)Create a method to find the minimum value which is greater than 7 and even from the list
    //12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi

    public static void getMinGreaterThanSevenEven(List<Integer>nums){
       Integer min= nums.stream().filter(t->t>7 && t%2==0).sorted().reduce((t,u)->t).get();
        System.out.println(min);
    }


}

