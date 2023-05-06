package LambdaRecap;

import java.util.stream.IntStream;

public class Lambda04 {
    public static void main(String[] args) {

        System.out.println(birdenXeKadarToplam(10));
        System.out.println("**********");
        System.out.println(birdenXeKadarTekSayilarinToplami(-5));
        System.out.println("**********");
        System.out.println(birdenSonsuzaKadarTekSayilarinIlkXTanesiniTopla(3));
        System.out.println("**********");
        System.out.println(ikidenSonsuzaGidenCiftSayilardanİlkXTanesiniTopla(3));
        System.out.println("**********");
        System.out.println(besdenSonsuzaGidenKuvvetlerindenIlkXKuvvetininToplami(3));
        System.out.println("**********");
        System.out.println(faktoriyel(5));
        System.out.println("**********");
    }

    //SORU1: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak),
    // toplamını bulup return ederek yazdırınız.

    public static int birdenXeKadarToplam(int x) {
        int sonuc = IntStream.range(1, x + 1).sum();
        return sonuc;
    }
    //public static int rengeClosed(){
    //   return  IntStream.rangeClosed(1,10).reduce(Math::addExact).getAsInt();
    //}

    //SORU2: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak),
    // tek sayıların, toplamını bulup return ederek yazdırınız. (x dahil olacak)

    public static int birdenXeKadarTekSayilarinToplami(int x) {
        int sonuc = IntStream.rangeClosed(1, x).filter(t -> t % 2 != 0).sum();
        return sonuc;
    }

    //SORU3: 1'den sonsuza kadar giden Tek sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız

    public static int birdenSonsuzaKadarTekSayilarinIlkXTanesiniTopla(int x) {
        int sonuc = IntStream.iterate(1, t -> t + 2).limit(x).sum();
        return sonuc;
    }

    //SORU4: 2'den sonsuza kadar giden Çift sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız

    public static int ikidenSonsuzaGidenCiftSayilardanİlkXTanesiniTopla(int x) {
        int sonuc = IntStream.iterate(2, t -> t + 2).limit(x).sum();
        return sonuc;
    }

    //SORU5: 5'den sonsuza kadar giden kuvvetlerinden
    // ilk x kuvvetinin toplamını return ederek yazdırınız

    public static int besdenSonsuzaGidenKuvvetlerindenIlkXKuvvetininToplami(int x) {
        int sonuc = IntStream.iterate(5, t -> t * 5).limit(x).sum();
        return sonuc;
    }

    //SORU 6: X sayisinin faktoriyelini bulunuz

    public static int faktoriyel(int x) {
        int sonuc = IntStream.rangeClosed(1, x).reduce(1, (t, u) -> t * u);
        return sonuc;
    }
    /*

    public static int getf(int a){
        if(a<0){
            System.out.println("negatif deger alamaz");
            return -1;
        }
      return   IntStream.rangeClosed(1,a).reduce(Math::multiplyExact).getAsInt();
    }
 */


}
