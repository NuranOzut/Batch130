package advanced_practice.practice06;

public class Q04_MethodOverloading_Hacim {
    //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir
    // kod yaziniz.(Method overloading kullanınız)

    public static void main(String[] args) {
        Hacim obje= new Hacim();
        int kupunHacmi=obje.hacimHesapla(5);
        System.out.println("kupunHacmi: "+ kupunHacmi);
        int karePrizmaHacmi= obje.HacimHespla(5,3);
        System.out.println("karePrizmaHacmi: "+ karePrizmaHacmi);
        int dikdortgenPrizamaHacmi= obje.HacimHesapla(5,3,7);
        System.out.println("dikdortgenPrizmaHacmi: "+dikdortgenPrizamaHacmi);



    }
}
