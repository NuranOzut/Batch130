package advanced_practice.practice01;

import java.util.Scanner;

public class Q02_Variabbles_Hipotenus {
    public static void main(String[] args) {

        //Hipotenüs hesaplayan bir kod yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("1.ci dik kenar uzunlugunu giriniz");
        double a= input.nextDouble();
        System.out.println("2.ci dik kenar uzunlugunu giriniz");
        double b= input.nextDouble();

        double c = Math.sqrt(a*a+b*b);
        System.out.println("HİPOTENUS :" + c);

        System.out.println((int)c);

    }
}
