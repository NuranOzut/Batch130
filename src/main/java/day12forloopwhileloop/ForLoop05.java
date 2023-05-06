package day12forloopwhileloop;

public class ForLoop05 {

    public static void main(String[] args) {

        //Example 1) Hic sayi kullanmadan 1den 100e kadar olan sayilari konsola yazdiriniz

        for(int i='d'/'d'; i<='d'; i++){
            System.out.print(i + " ");

        }
         //Not1: bazi loop lar hic calismayabilir

        for(int i=1; i<0; i--){
            System.out.println("Hİ");//ZERO EXECUTİON
        }

        //Not2: bazi loop sonsuz defa calisabilir
        //Bu tarz loop lara sonsuz infinite loop denir
        // genellikle increment decrement kismindaki hatalardan kaynaklanir

        //for(int i=1; i<10; i--){
        //  System.out.println("Java is money");//İNFİNİTE LOOP

        //}

        //Not3: Baska bir infitive loop
        //Loop olusturdugunuzda ikinci kismi yazmazsaniz, infinite loop olur

        //for(int i =1;    ;   ){
        //    System.out.println("Hi");
        //}


    }//main
}//class
