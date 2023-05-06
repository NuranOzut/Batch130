package Gulce;


import day08nestedifternary.Ternary01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class gulce {
    public static void main(String[] args) {

//        1)	Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
//                Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
//                Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"

        String pass ="şlj asdgh6h".trim().replaceAll(" ","");
       String passwrd = pass.length()> 8 ? "geçerli pass" :"geçersiz pass" ;
        System.out.println("password: " +passwrd);

//        1)	Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
//                a)	Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
//                b)	Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
//                c)	a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "


        // array tasklerinde index li bir ifade yok ise direk foreach kullanılabilir ama indx istiyorsa
        // for loop dowhile loop gibi başka seçenekler kullanılmalı
        //foreachloop açmak için kısaca iter yazabiliriz
       // for (String arg : args) {


        String arr[]={"Abdurrahman" , "Emre", "Yunus", "Ali","Akın","Asil", "Mehmet","Can","Veli"};
        System.out.println(Arrays.toString(arr));//[Abdurrahman, Emre, Yunus, Ali, Akın, Asil, Mehmet, Can, Veli]
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));//[Ali, Can, Emre, Akın, Asil, Veli, Yunus, Mehmet, Abdurrahman]


//Strıng array elemanlarını karakter sayısına göre
// ve aynı karakter sayısına göre naturaal order alfabetik sıraya göre
//ve tersten buyukten küçüge sırala

        String brr[]={"Abdurrahman" , "Emre", "Yunus", "Ali","Akın","Asil", "Mehmet","Can","Veli"};
        Arrays.sort( brr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(brr));//alfabetik sıraya göre büyükten küçüğe






//EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi =5 olsun

/*


^
^^
^^^
^^^^
^^^^^
|||
|||
|||
|||
|||


 */
        int tac = 5;
        int govde = 5;

        for (int i = 0; i <= tac; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("^");
            }
            System.out.println();
        }
        for (int i = 0; i < govde; i++) {
            System.out.println("|||");

        }
/*
Kullancidan pozitif bir tam sayi girmesini isteyin
Girilen tam sayi uc basamakli ise ekrana "3 Basamakli" yazidirin
3 basamaklşi degilse cift olup olmadigini kontrol edin
cift ise "3 Basamakli olmayan cift sayi" yazdirin
cift degil ise " 3 Basamakli olmayan tek sayi" yazdirin

*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz.");
        int num = input.nextInt();

        if (!(num > 99) || !(num < 1000)) {
            if (num % 2 == 0) {
                System.out.println("3 Basamakli olmayan cift sayi");
            } else
                System.out.println("3 Basamakli olmayan tek sayi");

        } else
            System.out.println(" 3 basamaklı sayı");

//Baslangic ve bitis sayilari arasindaki artis miktarinca artirilarak
// verilen tum sayilari aralarina virgul koyarak yazdirin
        int baslangic = 10;
        int bitis = 50;
        int artisMiktari = 5;

        for (int i = baslangic; i <= bitis; i+=artisMiktari) {
            if (i<bitis){
                System.out.print(i+",");
            }else
                System.out.print(i);

        }
        System.out.println();

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);

            }
            System.out.println();
        }

    }
}
