package day28exceptions;

public class Exceptions02 {
    public static void main(String[] args) {

        String s = "1234";
        convertStringToInt(s);

        String t = "1a2b";
        convertStringToInt(t);

    }

    //icinde rakamlar disinda karakter olan bir String i sayiya cevirmek isterseniz
    //Java "Number Format Exception" atar
    public static void convertStringToInt(String s) {

        int intS =0;

        try {
            intS = Integer.valueOf(s);
        } catch (NumberFormatException e) {
            System.out.println("Bir String in sayiya donusturulebilmesi icin rakam disi karakter icermemesi gerekir");
            System.out.println(e.getMessage());
        }

        System.out.println(intS + 1);
    }
}
