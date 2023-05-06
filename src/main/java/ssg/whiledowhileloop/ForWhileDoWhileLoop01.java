package ssg.whiledowhileloop;

public class ForWhileDoWhileLoop01 {

    public static void main(String[] args) {
        //Soru 1) 1 ile 5 arasındaki (1 ve 5 dahil) sayıları aynı satırda yazdırın.


        for (int i = 1; i <6 ; i++) {

            System.out.print(i+" ");

        }

        int j=1;
        while (j<=5){
            System.out.print(j+" ");
            j++;
        }


        int k=1;

        do{
            System.out.print(k+ " ");
            k++;
        }while (k<=5);





    }



}
