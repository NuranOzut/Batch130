package day02datatypesmethodcreation;

public class Variables02 {

    /*
    Non-Primitive Data Types: String bir non-primitive data type'dir.
                              Uretilen her bir class ayni zamanda non-primitive data type'dir
                              Bu yuzden "non-primitive data type" lar sinirsiz denebilir.
                              Non-primitive data type'larin isimleri buyuk harfle baslar
                              Non-primitive data type'larin tamami icin Java memory'de ayni miktarda yer ayirir

      Interview Sorusu: "primitive" ve "non-primitive" data type'lari arasindaki fark nedir?
                        1)"primitive" ler sadece bizim atadigimiz degeri icerir
                          "non-primitive" ler bizim atadigimiz deger ve method'lari icerir
                        2)"primitive" ler kucuk harfle baslar, "non-primitive" ler buyuk harfle baslar
                        3)"primite" leri Java uretir ve 8 tanedir,
                          "non-primitive" leri Java ve developerlar uretir, sinirsiz sayidadir.
                        4)"primitive" ler memory'de data type'ina gore yer kaplar,
                          "non-primitive" ler icin Java memory' de hep ayni buyuklukte yer ayirir.
     */
    public static void main(String[] args) {

        //Ornek 1: Sehir ismi icin bir variable olusturun ve bir deger atayip onu ekrana yazdiriniz
        String cityName = "Miami";

        System.out.println(cityName);

    }
}
