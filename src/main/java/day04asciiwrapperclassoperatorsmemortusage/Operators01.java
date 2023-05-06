package day04asciiwrapperclassoperatorsmemortusage;

public class Operators01 {



        /* 1) +, -, *, / islemleri Javada matematikte kullanildigi gibi kullanilir
        Note 1: int/int ==> int olur
        Note 2: double/int ==> double olur.Cunku Javada matematiksel islemlerde farklı data type lari kullanirsa sonuc buyuk data type inda olur

           2) Javada 'Logical operator' lar vardir
           AND ve OR islemleri 'Logical operator'lardir
           i) AND işleminden true alabilmek için her şey true olmalıdır.
           AND işlemi "perfectionist" tir.
           AND işleminde bir tane false sonucu false yapar.
           ii) OR işleminde bir tane true sonucu true yapmaya yeter.(|| or symbol)
           OR işleminde sonucun false olması için her şey false olmalıdır.
           OR işlemi "polyanna" gibidir.
               || veya operatoru Polyanacidir.En ufak bir pozitiflikten true doner
               Cay   veya   Limon
                 +    ||      +     = true
                 +    ||      -     = true
                 -    ||      +      = true
                 -    ||      -      = false
           iii) NOT Operatörü true olanı false, false olanı true yapar. (! symbol)
                !true = false
                !false = true
                !!true = true

           3)Karşılaştırma Operatörleri(Comparison Operators)
               <, >, >=, <=, ==, !=
             Note:Karşılaştırma Operatörlerini kullandığınız kesinlikle "boolean (true/false)" alırsınız

             Note: Biz AND islemi icin "&&" kullaniriz ama "&" kullanim da gecerlidir.
              Farklari nedir?
              "&&" kullanim ilk ifade "false" oldugunda digerlerini kontrol etmez dolayisiyla hizli calisir.
              "&" kullanim ilk ifade ne olursa olsun digerlerini kontrol eder dolayisiyla yavas calisir.
              Bu yuzden biz hep "&&" kullaniriz.

         */


    public static void main(String[] args) {

        boolean first = 3<5;
        boolean second = 2+3 != 5;
        boolean third = 2+3*5>= 19;

        System.out.println(first + " + " + second + " - " + third);
        System.out.println(first && second);
        System.out.println(first || second || third);


}
}
