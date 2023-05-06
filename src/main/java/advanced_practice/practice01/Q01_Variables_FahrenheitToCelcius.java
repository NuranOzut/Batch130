package advanced_practice.practice01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q01_Variables_FahrenheitToCelcius {
    public static void main(String[] args) {

        // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
        // formül: c = (f-32)*5/9

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Fahrenheit degeri giriniz");

        double f= input.nextDouble();

        double c = (f-32)*5/9;
        System.out.println("Celcius :" + c);


        //Ondalik kismi belirli bir formatta yazdirmak icin

        //1.Yol DecimalFormat class

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String formattedCelcius =decimalFormat.format(c);
        System.out.println("formattedCelcius = " + formattedCelcius);

        //2.Yol Printf ile herhangi bir sayı, 2f=> iki basakmalı format

        System.out.printf("%.2f",c);




    }
}
