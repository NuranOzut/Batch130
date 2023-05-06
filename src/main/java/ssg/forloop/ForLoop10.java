package ssg.forloop;

public class ForLoop10 {
    public static void main(String[] args) {


    /*
    soru 10) input olarak girilen bir stringi forLoop kullanarak ters cevirin
    */
        String input = "Java Guzeldir";
        String str = "";
        for (int i = input.length() - 1; i >= 0; i--) {

            str += input.substring(i, i + 1);


            System.out.println(str);

        }


    }
}
