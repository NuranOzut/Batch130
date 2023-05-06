package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop03 {

    public static void main(String[] args) {

        //Example 1)

        Scanner input = new Scanner(System.in);
        System.out.println("Satir(row) sayisini giriniz");
        int row = input.nextInt();

        for(int i=1; i<=4; i++){

            for(int k=row; k>=i; k--){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
