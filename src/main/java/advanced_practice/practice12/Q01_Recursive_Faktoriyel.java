package advanced_practice.practice12;

public class Q01_Recursive_Faktoriyel {
    public static void main(String[] args) {
        //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)
        System.out.println(faktoryel(3));
    }

    public static int faktoryel(int sayi) {

        if (sayi >= 0) {
            if (sayi == 0 || sayi == 1) {
                return 1;
            } else {
                return sayi * faktoryel(sayi - 1);
            }
        } else {
            throw new ArithmeticException("Sayi sifirdan kucuk olamaz");
        }


    }
}
