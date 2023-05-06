package day02datatypesmethodcreation;

public class Variables01 {

    //primitive data types --> char - boolean - byte - short - int - float - double
    //float: virgullu sayilar(ondalık sayılar - decimal numbers) icin kullanilir (fiyatlandirmalar - 12.99)
    //double: virgullu sayilar(ondalık sayılar - decimal numbers) icin kullanilir (Hücre agirligi 0.0000000112)

    //Note: primitive data type'larini Java olusturur biz olusturamayiz
    //Note: primitive data type'larin isimlerinde sadece kucuk harf kullanilir
    //Note: primitive data'lar data type'larina gore farkli farkli yer kaplarlar
    //Note: primitive data'lar iclerinde sadece sizin atadiginiz degeri barindirirlar

    public static void main(String[] args) {

        //Ornek 1: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz
        //Note: Java "Decimal Numbers" i otomatik "double" kabul eder.
        // Siz data type'ini "float" yazarsaniz hata verir.
        //float olmasinda israr ediyorsaniz sonuna "F" veya "f"  koymalisiniz
        //float memeory'de 4 byte yer kaplar, double 8 byte yer kaplar
        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;
        // system.out.println() ekrana yazdirir ve "pointer" i bir sonraki satira koyar
        //system.out.print() ekrana yazdirir ve "pointer" i ayn satirda tutar

        System.out.println(shirtPrice + shoesPrice);

        // system.out.println() yazdirmanin kisa yolu "sout" yaz enter a bas

        System.out.println();

        //Ornek 2: Hucre agirligi ve Amip'in agirligi icin iki tane variable olusturun ve agirliklari farkini ekrana yazdiriniz
        double weightCell = 0.0000000112;
        double weightAmip = 0.0000000023;

        System.out.println(weightCell - weightAmip );





    }
}
