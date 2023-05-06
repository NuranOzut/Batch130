package Gulce;

import practice.nighttime03.C03_IncrementDecrement;

public class C04_Static {
    public static void main(String[] args) {

        System.out.println(C03_StaticDepo.okulIsmi);

       C03_StaticDepo obje1 = new C03_StaticDepo();

        System.out.println(obje1.ogrenciGul);

        C03_StaticDepo.okulIsmi="Mine okulları";
        System.out.println(C03_StaticDepo.okulIsmi);
        C03_StaticDepo obje2=new C03_StaticDepo();
        obje2.ogrenciGul="Zeynep Karagöl";
        System.out.println(obje2.ogrenciGul);
        System.out.println(obje1.ogrenciGul);



    }
}
