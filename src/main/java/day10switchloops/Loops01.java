package day10switchloops;

public class Loops01 {
    public static void main(String[] args) {

        /*

        Code standarts
        i)tekrar olmamalidir(repetition)
        ii)dinamik olmalidir(dynamic)
        ii)tamir ve update kolay olmalidir
         */

        //Example 1) Ekrana 5 kere "Hi" yazdirin

        //i) for-loop ii) while-loop iii)do-while-loop iv) for-each-loop

        //i) for-loop
        //Baslangic degeri    loop un calisma sarti   increment-decrement
        for (int i = 1; i < 6; i++) {
            System.out.println("Hi");
        }
        //Example 2) 11den 14e kadar  tum tam sayilari ekrana yazdiran kodu yazdirin

        for (int i = 11; i < 15; i++) {
            System.out.println(i);

        }

        //Example 3)40 tan 23 e kadar tum cift tam sayilari ekrana yazdiran kodu yaziniz
        for (int i = 40; i > 22; i--) {


            if (i % 2==0) {
                System.out.println(i);
            }

        }

        //Example 4)18 den 56 ya kadar tum tek tam sayilari ekrana yazdiran kodu yaziniz

        for(int i=18; i<57; i++){
            if(i%2!=0){
                System.out.print(i + " ");

            }
        }


    }

}