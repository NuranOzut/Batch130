package Gulce.miniproje.biletFiyatHesaplama;

/*
Project: mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan uygulama
         Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş)
         koltuk no  bilgilerini alın.
         Mesafe başına ücret 1 TL / km olarak alın.(Gidiş-Dönüş için *2)
         İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki kuralları uygulayın ;

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
       1- Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
       2-Yaş indirimi:
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
       3-Tekli Koltuk ücreti:
        Koltuk numarası 3 veya 3 ün katı ise bilet fiyatı %20 artırılır.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BiletRezervasyon {
    public static void main(String[] args) {
        List<String> seatNo = new ArrayList<String>();
        for (int i = 1; i < 33; i++) {
            seatNo.add(String.valueOf(i));

        }
        Bilet bilet = new Bilet();
        Bus bus = new Bus("34 IST 78", seatNo);

    }

    public static void start(Bus bus,Bilet bilet) {
        Scanner inp =new Scanner(System.in);
        int select;
        do {
            System.out.println("Bilet Rezervasyon Sistemine Hosgeldiniz");
            System.out.print("Lütfen gidilecek mesafeyi km olatak giriniz: ");
            bilet.distance= inp.nextInt();
            System.out.println("Yolculuk tipini seçiniz");
            System.out.println("1 tekyön \n 2 gidiş dönüş");
            bilet.typeNp=inp.nextInt();
            System.out.println("Lütfen yaşınızı giriniz");
            int age =inp.nextInt();
            System.out.println("Koltuk no seçiniz: ");
            System.out.println("Tekli koltuk ücretleri %20 daha fazladır.");
            System.out.println(bus.seats);
            bilet.seatNo=inp.nextInt();
            //kullanıcının seçtiği koltugu listeden kaldır.
            bus.seats.remove(String.valueOf(bilet.seatNo));
            boolean check =bilet.typeNp==1||bilet.typeNp==2;
//            boolean check= bilet.typeNp==1||bilet.typeNp==2 && bilet.distance>0 && age>0;
//            if (check)
            if (bilet.distance>0 && age>0 && check){

            }else{
                System.out.println("hatalı giriş yaptınız");
            }
            System.out.println("yeni işlem için 1, çıkış için 0 giriniz.");
            select=inp.nextInt();

        }while(select!=0);
        System.out.println("iyi günler dileriz");

    }


}
