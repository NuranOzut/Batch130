package ssg.StringManipulation;

public class C05_stringManipulation {
    /*
   soru 5)Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
   karakteri yazdırınız.
   */
    public static void main(String[] args) {

        String str = "java kolaydır   ";
        int sonKarakterinIndexi = str.trim().length() - 1;
        String sonkarakter = str.substring(sonKarakterinIndexi, sonKarakterinIndexi + 1);
        System.out.println(sonkarakter);

    }


}
