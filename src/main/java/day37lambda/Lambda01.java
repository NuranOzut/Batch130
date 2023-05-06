package day37lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);
        System.out.println(getSumOfAllElements(myList));
        System.out.println("\n*******");
        System.out.println(getSumFromSevenToSeven());
        System.out.println("\n*******");
        System.out.println(getSumFromThreeToNine1());
        System.out.println("\n*******");
        System.out.println(getSumFromThreeToNine2());
        System.out.println("\n*******");
        System.out.println(getFaktoriyel(5));
        System.out.println("\n*******");
        System.out.println(getSumOfDigitBetweenTwoInts(90,180));
        System.out.println("\n*******");


    }
    //Example 1: Verilen list'teki tum sayilarin toplamini veren method'u olusturunuz.

    public static int getSumOfAllElements(List<Integer> myList) {

        return myList.stream().reduce(Math::addExact).get();
    }

    //Example 2: 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.

    public static int getSumFromSevenToSeven() {
        return IntStream.rangeClosed(7, 70).reduce(Math::addExact).getAsInt();
    }

    //rangeClosed==> baslangis ve bitis araligi veriyor
    //Intstream==> integerlari yukardan asagi diziyor.

    //Example 3: 3'den 9' a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
//Note: Her zaman bize verilen list ile islem yapamayabiliriz
//      Bunun icin IntStream methodunu kullaniriz.
//      rangeClosed(startInclusive, endInclusive) methodu bize
//      baslangıc ve bitis degeri kapsayan degiskenlerle islem yapmamızı saglar
    public static int getSumFromThreeToNine1() {
        return IntStream.rangeClosed(3, 9).reduce(Math::multiplyExact).getAsInt();
    }
    //range(a,b)==> a dahil,b dahil degil
    //Integer class'i Math class'i kadar zengin degil ornegin multiply method'u yok,
    // o yuzden genellikle Math class'in method'larini kullaniyoruz.
    public static int getSumFromThreeToNine2() {
        return IntStream.range(3, 10).reduce(Math::multiplyExact).getAsInt();
    }
//Example 4) size verilen sayinin faktoriyelini hesaplayan kodu yaziniz
    public static int getFaktoriyel(int x){
        if(x==0){
        return 1;
    } else if (x<0) {
            System.out.println("Faktoriyel islemi negatif sayilarla yapilmaz");
            return -1;
        }else {
        }return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
    }

    //Example 5: Size verilen 2 tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    public static int getSumOfEvensBetweenTwoInt(int a, int b){
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        return IntStream.range(a+1, b).filter(Utils::isNumberEven).sum();
    }
    //Example 6:Size verilen iki tamsayi arasindaki tum tasmsayilarin toplamini veren kodu yaziniz
    //// 12 ve 18 ==> 13 14 15 16 17 ==> 4+5+6+7+8 = 30
    public static int getSumOfDigitBetweenTwoInts(int a, int b){
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
       return IntStream.range(a+1,b).map(Utils::getSumOfDigits).sum();
    }
    // rakamlari teker teker alip sonradan toplayacak streamdeki elemanlar degiscek bu yuzden
    // reduce yerine map kullandik.




}
