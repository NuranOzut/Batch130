package day04asciiwrapperclassoperatorsmemortusage;

import java.sql.SQLOutput;

public class WrapperClass {

    public static void main(String[] args) {

        // primitive:       char -   boolean - byte -   short -  int -  long - float - double
        //Wrapper Class: Character - Boolean - Byte - Short - İnteger - Long - Float - Double
        //Wrapper Class'lar non-primitive'dir o yuzden memory de cok yer kaplarlar,  oyuzden sart degilse Wrapper Class kullanmayi tercih etmeyiz

        int n = 12;//"n" yazip "nokta" koyarsaniz hic method goremezsiniz, cunku "primitive"ler method icermez

        Integer m = 12;//"m" yazip "nokta" koyarsaniz bir cok method gorursunuz, cunku "wrapper class" lar method icerir

        byte p =23;

        Byte r = 43;

        //Example 1: short data type'inin minimum ve maximum degerlerini kod yazarak bulunuz
        Short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        Short minShort = Short.MIN_VALUE;
        System.out.println(minShort);

        //Example 2: int data type'in minimum degeri ile byte data type'inin maximum degerinin toplamını yaziniz
        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;


        //Example 3: i)Primitive int'i Wrapper Integer'a ceviriniz
        int num = 22;

        Integer wrapperNum = num;
        System.out.println(wrapperNum);

        //           ii)Wrapper Byte'i primitive byte'a ceviriniz
        Byte k =43;

        byte primitiveK = k;
        System.out.println(primitiveK);

        //Example 4: i)Primitive char'i Wrapper Character'e ceviriniz
        char initial = 'T';
        Character initialWrapper = initial;

        //           ii)Wrapper Boolean'i primitive boolean'a ceviriniz
        Boolean isOld = true;
        boolean isOldWrapper = isOld;

        //Example 5: Size String olan verilen iki fiyat'in toplamini ekrana yazdiriniz
        String shirt = "2300";
        String shoes = "5200";

        //Java'da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur.
        //Java'da "+" sembolu iki String arasinda veya bir String ve bir sayi arasinda kullanilirsa "concatenation islemi" olur.
        //Note: Concatenation islemlerinde Java matematikteki islem önceligi kurallarini kullanir.
        //Islem onceligi kurallari: i)Once uslu sayilar ii)Parantez ici islemler yapilir iii)Carpma ve bolme iv) Toplama ve cikarma

        System.out.println(shirt + shoes);
       int toplamFiyat =Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);

        //Example 6: Size string olarak verilen iki fiyatin toplamini akrana yazdiriniz.
        //valueOf() methodu tum karakterleri rakam olan String'leri sayilara cevirir
        //          Eger valueOf() methodu kullanirken String'in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz.
       //           Bu hatayi duzeltmeyi ileride ogrenecegiz.
        String tv = "$11000";
        String radio = "300";

        int totalFiyat = Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalFiyat);


    }
}
