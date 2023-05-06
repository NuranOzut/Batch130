package ssg.forloop;

public class ForLoop04 {
    public static void main(String[] args) {
        /*
        Soru 4) 10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin
        */

        int bas=50;
        int son=70;


        for (int i = bas; i <=son ; i++) {
            if (i<son) {
                System.out.print(i + ",");
            }else System.out.println(i);
        }







}

}
