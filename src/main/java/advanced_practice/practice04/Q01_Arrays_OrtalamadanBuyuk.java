package advanced_practice.practice04;

public class Q01_Arrays_OrtalamadanBuyuk {
    public static void main(String[] args) {

        //Verilen bir Array'in elementlerinin ortalamasından büyük elementleri yazdıran bir kod yazınız.

        int[] arr = {5,9,15,1,0,11,3};

        int toplam =0;
        for(int w : arr){
            toplam+=w;
        }
        System.out.println("toplam ="+ toplam);

        double ortalama = toplam/arr.length;
        System.out.println("ortalama = "+ortalama);

        System.out.println("ortalamadan buyuk elementler: ");
        for(int w: arr){
            if(w>ortalama){
                System.out.println(w);
            }
        }



    }
}
