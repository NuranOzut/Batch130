package day09incrementdecrementternaryswitch;

public class NestedTernary01 {

    public static void main(String[] args) {

        //Example 1) Verilen yilin artik yil(Leap Year) olup olmadigini kontrol eden kodu yaziniz
        //Yil 100e bolunuyorsa 400e de bolunmelidir 1600==>Leap 1800==>Leap degil
        //Yil 100e bolunmuyorsa 4e bolunmelidir 2004==>Leap 2005==>Leap degil

        int year = 2005;
        String result = year%100==0 ? (year%400==0 ? "Leap" : "Not leap") : (year%4==0 ? "Leap" : "Not leap");
        System.out.println(result);

    }
}
