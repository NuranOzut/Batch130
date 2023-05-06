package day06stringmanipulationsifstatement;

import java.sql.SQLOutput;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1:Bir String'in bas ve sonunda space karakteri varsa siliniz.
        //   " Ali Can " ==>  "Ali Can"

        String s = "   Ali Can  ";

        //trim() methodu bir Strin in bas ve sondaki space karakterini siler, aradaki space lere dokunmaz
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        //Example 2: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz
        //           String tv = "$456.99";  String laptop = "$875.99" ==> 1332.98
        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$","" );
        System.out.println(tv2);

        String laptop2 = laptop1.replace("$","");
        System.out.println(laptop2);

        double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);

        //Example 3: Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdirin
        //           "Ali Can" ==> AC

        String name = "   ali cAN  ";
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second);

        System.out.println("" + first + second);

        //Example 4: Bir String in hic karakter icermedigini( bos String) kontrol eden kodu yaziniz
        String str = "";

        //1.yol: lenght() methodu
        boolean result1 = str.length()==0;
        System.out.println("String bos mu? " + result1);

        //2.yol: boolean() methodu Java bir konuda method uretmisse o methodu kulanmak en iyisidir
        boolean result2 = str.isEmpty();
        System.out.println(result2);

        //Example 5: Bir String in space haric hicbir karakter icermedigini kontrol eden kodu yaziniz

        String t ="     ";

        //1.yol:
        boolean result3 = t.replace(" ","").length()==0;
        System.out.println("Sadece space mi var?" + result3);

        //2.yol:
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println(result4);

        //3.yol:
        //Note: isBlank() methodu sadece space iceren String ler icin true verir
        //      space disinda bir karakter icerirse false verir
        //      isBlank() methodu bos Stringler icin true verir
        //      isBlank() methodu ==> space + hicbir sey icin true isEmpty() ==> hicbir sey icin true
        boolean result5 = t.isBlank();
        System.out.println(result5);

        //Example 6: Bir String de a, e, i karakterlerinin ilk gorunumlerinin index lerini ekrana yazdiriniz
        //           "Java is easy to learn" ==> 1 + 5 + 8 =  14

        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);

        int idxI = r.indexOf('i');
        System.out.println(idxI);

        int idxE = r.indexOf('e');
        System.out.println(idxE);

        System.out.println("Index'ler toplamı:" + (idxA+idxI+idxE));

        //Example 7: Bir String de "java" kelimesinin ilk olarak kacıncı index te  kullanildigini gosteren kodu yaziniz
        //           "Ah Java vah Java sensiz olmuyor Java" ==> 3

        String u = "Ah Java vah Java sensiz olmuyor Java";

        //indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin index ini almis olursunuz
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);

        //indexOf() methodu olmayan karakter ler icin kullanilirsa her zaman "-1" verir
        int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz);

        //Example 8: Bir String de a, i, e karakterlerinin "son" gorunumlerinin indexleri toplamini ekrana yazdiriniz
        //           "Java is easy to learn" ==> 18 + 5 + 17 = 40

        String v = "Java is easy to learn";
        int idxOfA = v.lastIndexOf('a');
        System.out.println(idxOfA);

        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI);

        int idxOfE = v.lastIndexOf('e');
        System.out.println(idxOfE);

        System.out.println("İndex'ler toplamı:" + (idxOfA+idxOfI+idxOfE));

        //Note: lastİndexOf() String de olmayan bir karakter icin kullanilirsa her zaman -1 verir

        //Example 9: Bir String teki tekrarsiz karakterleri ekrana yazdiriniz
        //           "abbcccdc" ==> ad

        String y = "aac";

        char ch1 = y.charAt(0);

        if(y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = y.charAt(1);

        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3 = y.charAt(2);

        if(y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }


        //Note: Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.
        //      Bazi kodlari bazi sartlara gore aktive etmek icin "if statement" kullanilir.
        //      if you study hard, you learn Java.

        //Example 10: Sayi pozitif ise ekrana yazdiriniz
        int num = 12;


        if(num>0) {
            System.out.println("pozitif");
        }

        //Example 11: Sayi -1 ile 10 arasinda ise ekrana "rakam" yazdirin

        int number = 3;

        if(num>-1 && number<10){
            System.out.println("rakam");
        }

        //Example 12: Sayi uc basamakli ise " Wooow" yazdirin.

        int number2 = -555;

       number2 = Math.abs(number2);

        if(number2>99 && number2<1000){
            System.out.println("Wooow");
        }





    }
}
