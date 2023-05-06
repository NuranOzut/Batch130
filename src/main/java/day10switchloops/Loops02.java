package day10switchloops;

import java.util.Locale;

public class Loops02 {
    public static void main(String[] args) {

        //Example 1)21 den 180e kadar hem 4 hem de 6 ile olunebilen tamsayilari yazdiran kodu yazdirin

        for(int i=21; i<181; i++){
            if(i%4==0 && i%6==0){
                System.out.println(i + " ");

            }
        }

        //Example 2) size verilen kucuk harfle yazilmis String in index i cift sayi olan character lerini buyuk harfler yazdirin
        // ankara AnKaRa

        String s ="ankara";

        for(int i =0;i<s.length(); i++){
            String ch = s.substring(i, i+1);
            if(i%2==0){
                System.out.println(ch.toUpperCase());

            }

        }



    }
}
