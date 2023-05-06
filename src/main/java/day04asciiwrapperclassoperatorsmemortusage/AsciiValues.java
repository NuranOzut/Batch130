package day04asciiwrapperclassoperatorsmemortusage;

public class AsciiValues {

    //Javada her karakterin bir degeri vardir.
    //Bu degerler ASCII Degerler olarak adlandirilir.
    //Bu degerlerin tamaminin bulundugu tabloya ASCII Table denir.


            public static void main(String[] args) {
                // Herhangi bir karakterin ASCII değerini bulmak için o karakteri "int" data type'ında bir variable'ın içine koyunuz.
                int ch = 'A';
                System.out.println(ch);

                int unlem = '!';
                System.out.println(unlem);

                char c1 = 'K';
                char c2 = '?';
                //Java'da char'ları matematiksel işlemlerde kullanırsanız, Java o char'ların ASCII değerlerini kullanır.
                System.out.println(c1 + c2);//138

    }
}
