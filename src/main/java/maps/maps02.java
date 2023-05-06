package maps;

import java.util.HashMap;
import java.util.Map;

public class maps02 {
    public static void main(String[] args) {
        //Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
        //bulunmaktadır. Ürünler arasında " Laptop " olup olmadığını kontrol etmek için kodu
        //yazınız.

        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);

        String laptopProduct="Laptop";
        if(product.containsKey(laptopProduct)){
            System.out.println(laptopProduct+ " vardir");
        }else{
            System.out.println(laptopProduct+ " yoktur");
        }




    }
}
