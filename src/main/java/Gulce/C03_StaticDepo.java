package Gulce;

public class C03_StaticDepo {

    static String okulIsmi = "Emre okulları";//static varaible
    String ogrenciGul = "Gul gecer";//instance varaıble


    public static void staticMethod() {
        System.out.println("Ben Static methodum");
    }

    public static void staticOlmayanMethod() {
        System.out.println("Ben sefil Static olmayan methodum");
    }
}
