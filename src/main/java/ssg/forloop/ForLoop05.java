package ssg.forloop;

public class ForLoop05 {
    public static void main(String[] args) {
        /*
        soru 5) 100'e(dahil) kadar olan tek ve cift sayıları iki ayrı dongu ile yazdırın.
        */
        for (int i = 0; i <=100; i++) {
            if (i%2==1){
                System.out.print(i+" ");
            }
        }
        System.out.println("\n");

        for (int i = 0; i <=100; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }


        }
    }
