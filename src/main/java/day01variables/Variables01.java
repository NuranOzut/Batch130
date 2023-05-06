package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //Variable oluşturmak
        //Java cumlesi = Statement
        //Java'da esittir demek Yani matematikte "=" , Java'da "=="
        //Java'da "=" "assigment operator" dir. Sagdaki degeri alir soldaki kutuya koyar
        //Access Modifier yazmazsaniz "access modifier" "default" demektir
        //Data Type + Variable Name ==> Variable Declaration
        //Assigment Operator + Variable degeri ==> Assigment
        //Eger Variable Declaration yapar, Assigment yapmazsaniz Java kendi degerlerini (default) koyar
        //default degerler sayilar icin sifirdir
        //Data type'ini  yaziniz    Variable ismi yaziniz    (Assigment Operator) Atama Operatoru  Variable degeri  ingilizcedek nokta gibi
              int                           age                         =                                13                   ;

        //Ornek1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        //Stringlere verilen  degerler cift tirnak icinde olmalidir
        //String'ler icin "default value" "null" dir.
        String studentName = "Ali Can";

        /*
        Java'da temelde iki tip data vardir;
        1)primitive data type
        char : tek karakterler icin kullanilir A, x, ?, 5
        boolean : booolean'lar sadece iki farklı deger alabilir; true(dogru) veya false(yanlis)
        byte : -128 den 127 e kadar tamsayi degerleri icin kullanilir (1 byte)
        short : -32768 ile 32767 arasindaki tamsayilar icin kullanilir (2 byte)
        int : -2,147,483, 648 ile 2,147, 483, 647 arasindaki sayilar icindir (4 byte)
        long : -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,808 arasindaki sayilar icindir (8 byte)
        float - double

        2)non-primitive data type
         */


       



        //Ornek2 : char data type'inda ilk ismin ilk harfi olara bir variable olusturunuz ve deger atayiniz
        //Note:char data type'inda degerler tek tirnak icine konulmalidir.
        char isminİlkHarfi = 'A';

        //Ornek3 : boolean data type'inde emeklimisin icin bir variable olusturun ve false degerini atayın.
        boolean emeklimisin = false;

        //Ornek4 : byte data type' inde ogrenci yasi icin bir variable olusturun ve deger atayin.
        byte studentAge = 23;

        //Ornek5 : site nufusu icin bir variable olusturun ve deger atayin.
        short siteNufusu = 1200;

        //Ornek6 : Ulke nufusları icin bir variable olusturup deger atamasi yapiniz
        int countryPopulation = 1864184648;

        //Ornek7 : insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
        //nOTE : Bir deger long ise sonuna "L" (tercih edilir) veya "l" konulur.
        long cellNumberInHumanBody = 87654321356788L;

        //Eger long'a atadiginiz deger int'lerin araliginda ise sonuna "L" koymaya gerek yok
        long weightOfSun = 1234567;








    }




}
