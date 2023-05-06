package Gulce.ternary;

public class ternar01 {
//    Nested Ternary kullanarak;
//    Şifreyi kontrol etmek için kodu yazınız.
//            8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
//            8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır.
//

    public static void main(String[] args) {

        String pass = "ksjl3flu";
        String passGecerlimi = pass.length() > 8 ? pass.startsWith("i") ? "geçerli " : "geçersiz" : pass.startsWith("k") ? "geçerli" : "geçersiz";
        System.out.println(passGecerlimi);

//        Bir sayının mutlak değerini hesaplamak için kodu yazınız.
//        Pozitif sayılar ve sıfır mutlak değer için sayı ile aynıdır.
//        Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarpınız.
        System.out.println();


        int num = -5;
        int number = num < 0 ? -1 * num : num;
        System.out.println(number);
        //  Ternary kullanarak; 2 tamsayıdan küçük olanı konsola yazdıran bir program yazınız.
        int a = 96;
        int b = 9;
        int kucukSayı = a < b ? a : b;
        System.out.println(kucukSayı);
//2.yol

        System.out.println(Math.min(a, b));

        System.out.println();
        System.out.println();


//        Sayı 3 basamaklı ise konsolda kodunuz "Bu sayı 3 basamaklıdır" olacaktır. Aksi takdirde,
//        kodunuz " Bu sayı 3 basamaklı değildir" olacaktır.

        int sayı = -246;
        sayı = Math.abs(sayı);

        String basamakSayısı = (sayı > 99 && sayı < 1000) ? "sayı 3 basamaklıdır" : "sayı 3 basamaklı değildir.";
        System.out.println(basamakSayısı);
        System.out.println();
        //  Ternary kullanarak; konsolda tek sayılar için “Tek” , çift sayılar için “Çift” yazdırınız

        int t = 523;
        String tekCift = t % 2 == 0 ? "çift" : "tek";
        System.out.println(tekCift);
        System.out.println();
        // Ternary kullanarak; konsolda sayı pozitif ise “Pozitif” , negatif ise “Pozitif Değil” yazdırınız.

        int q = -96;


        String sonuc = q < 0 ? "pozitif değil " : "pozitif";
        System.out.println(sonuc);


        System.out.println();
    }


}
