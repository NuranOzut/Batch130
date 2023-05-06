package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Exxample 1) String bir array olusturun ve 6 tane eleman yerlestiriniz
        // sonra karakter sayisi 5ten cok olanlari siliniz

        String colors[] = new String[6];

        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";

        System.out.println(Arrays.toString(colors));

        //Note: yeni bir array olusturup karakter sayisi 5 ve 5ten kucuk olan elemanari
        //yeni array e transfer edicez boylelikle yeni array de karakter sayisi
        //5ten buyuk olan hic bir eleman olmayacak
        //array olustururken iki sey belirlenmeli;
        // *elemanlarin data type i
        // *yeni arrayde kac tane eleman olacak
        //verilen array de eleman sayisi 5 ve 5ten kucuk olan kac tane eleman var bulunmali

        int counter =0;

        for (String w: colors) {
            if (w.length()<=5){
                counter++;

            }
        }
        System.out.println(counter);

        String newColors[] =new String[counter];

        int idx =0;

        for (String w: colors) {
            if(w.length()<=5){
                newColors[idx] = w;
                idx++;

            }
        }
        System.out.println(Arrays.toString(newColors));

        //Note:arrayler collectionlara gore ilkel yapidadir, collectionlarda biz istedigimiz elemani silebiliyoruz
        //fakat arraylerde elemanlari silmemiz icin yeni array olusturmamiz gerekiyor

    }
}
