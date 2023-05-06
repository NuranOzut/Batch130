package day09incrementdecrementternaryswitch;

public class Ternary01 {
    public static void main(String[] args) {

        //Example 1i)

        int a = 10;
        int b = 20;

        int r1 = a < 7 ? a++ : b++;

        System.out.println(r1); //++b olsaydi b nin arttirilmis degeri sonuca yollanirdi

        System.out.println(a);

        System.out.println(b);

        //Example 1ii)

        int c = 10;
        int d = 20;

        int r2 = c < d ? c++ : ++d;
        System.out.println(r2);
        System.out.println(c);
        System.out.println(d);

        //Example 2) Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        // -4 ==> -1*-4  4 ==> 4  0 ==> 0

        int e = -4;
        int r3 = e < 0 ? -1 * e : e;
        System.out.println(r3);

        int f = 5;
        int r4 = f < 0 ? -1 * f : f;
        System.out.println(r4);

        int g = 0;
        int r5 = g < 0 ? -1 * g : g;
        System.out.println(r5);

        //Example 3) Iki sayinin isareti aynı ise bu sayilari carpan
        // isaretleri farklı ise "Farklı isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz

        int m = 5;
        int n = -6;

        //Object java da butun non primitive data type larin ortak parant idir
        //Object in parent i yoktur
        //Farkli data type lari icin ortak variable olusturmak icin data type Object olur

        Object r6 = (m > 0 && n > 0) || (m < 0 && n < 0) ? m * n : "Farkli isaretli sayilari carpamiyorum";
        System.out.println(r6);

        //Example 4) Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        int p = 436;

        String r7 = p > 99 && p < 1000 ? p + "uc basamakli" : p + "uc basamakli degil";
        System.out.println(r7);

        int r = -436;
        int s = Math.abs(r);
        String r8 = s > 99 && s < 1000 ? r + "uc basamakli" : r + "uc basamakli degil";
        System.out.println(r8);


    }


}
