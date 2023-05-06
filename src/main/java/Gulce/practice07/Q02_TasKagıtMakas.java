package Gulce.practice07;

import java.util.Scanner;

public class Q02_TasKagıtMakas {
    /*
      Taş-Kağıt-Makas oyunu yazınız.
      -Oyuncudan tahmin alınız.
      -Bilgisayarın tahmini ile karşılaştırınız.
      -3'e ilk ulaşan kazanır
      -3 farkla kazanan Altın Skor, 2 farkla kazanan Gümüş Skor, 1 farkla kazanan Platin Skor ile kazanır.
   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oyunucuKazanmaSayisi = 0;
        int bilgisayarKazanmaSayisi = 0;

        while (oyunucuKazanmaSayisi<3 && bilgisayarKazanmaSayisi<3){

            System.out.println("Seçim Yap: \nTas \nKagit \nMakas");
            String oyunucuTahmini = input.next().toLowerCase();


            String[] arr={"Tas", "Kagit", "Makas"};
            String bilgisayarTahmini = arr[(int)(Math.random()*3)].toLowerCase();
            System.out.println("bilgisayar tahmini: "+ bilgisayarTahmini);

            if(oyunucuTahmini.equals(bilgisayarTahmini)){
                System.out.println("\n Berabere! Skor: "+oyunucuKazanmaSayisi+"--"+bilgisayarKazanmaSayisi);
            } else if (oyunucuTahmini.equals("tas") && bilgisayarTahmini.equals("makas") || oyunucuTahmini.equals("kagit") && bilgisayarTahmini.equals("tas") || oyunucuTahmini.equals("makas") && bilgisayarTahmini.equals("kagit")) {
                oyunucuKazanmaSayisi++;
                System.out.println("Kazandınız! Skor: "+oyunucuKazanmaSayisi+"--"+bilgisayarKazanmaSayisi);
            }else {
                bilgisayarKazanmaSayisi++;
                System.out.println("Bilgisayar Kazandı! Skor: "+oyunucuKazanmaSayisi+"--"+bilgisayarKazanmaSayisi);
            }
        }
    }




}