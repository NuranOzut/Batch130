package advanced_practice.practice08;

public class Q05_InheritanceQ05_Inheritance {
    //Dairenin alanını hesalayan bir method oluşturunuz.
    // (matematik işlemleri için inheritance kullanınız)
    public static void main(String[] args) {
        daireninAlani(5);
        daireninAlani(3);
    }
    static void daireninAlani(int r){
        Daire daireObjesi = new Daire();
        System.out.println(daireObjesi.carpma(daireObjesi.piSayisi,daireObjesi.karesiniAl(r)));
    }

}

