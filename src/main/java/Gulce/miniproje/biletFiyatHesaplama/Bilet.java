package Gulce.miniproje.biletFiyatHesaplama;

public class Bilet {

    public int distance;
    public int typeNp;
    public int seatNo;
    public double price;
   public void printBilet(Bus bus){
       System.out.println("Toplam tutar : "+price);
       System.out.println("***Bilet detay****");
       System.out.println("Otobüs Plaka"+bus.numberPlate);
       System.out.println("mesafe : "+distance);
       System.out.println("Yolculuk tipi : "+ (typeNp==1 ? "tekyön":"gidişdönüş"));
       System.out.println("Koltuk no: "+seatNo);
       System.out.println("Keyifli yolculuklar dileriz...");
   }


}
