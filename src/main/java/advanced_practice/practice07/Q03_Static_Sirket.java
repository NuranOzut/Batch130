package advanced_practice.practice07;

public class Q03_Static_Sirket {
    public static void main(String[] args) {
        //Basit bir şirket bütçesi kodu yazınız.

        Sirket dep1=new Sirket();
        dep1.kasadanButceyeParaAl(500);

        System.out.println("dep1.depButcesi = " + dep1.depButcesi);
        System.out.println("Sirket.kasa = " + Sirket.kasa);

        Sirket.kasadanParaHarca(2500);


    }
}
