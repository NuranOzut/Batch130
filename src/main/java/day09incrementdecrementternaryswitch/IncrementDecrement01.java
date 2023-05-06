package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {

    public static void main(String[] args) {

        int a = 5;
        System.out.println(a);

        //Increment 1
        a= a + 2; // veya a += 2
        System.out.println(a);

        //Example 1) Bir integer variable olusturun ve onu iki yontemle 5 arttirin

        int b = 10;
        System.out.println(b);

        b = b + 5; b += 5;

        System.out.println(b);

        //Decrement 1
        int c = 8;
        System.out.println(c);

        c = c-3; c -=3;
        System.out.println(c);

        //Increment 2
        int d = 6;
        System.out.println(d);
        d = d*2; d *= 2;
        System.out.println(d);

        //Decrement 2
        int e = 24;
        System.out.println(e);
        e = e/2; e /= 2;
        System.out.println(e);

        //"1" ile incremet
        int f = 12;
        System.out.println(f);
        //f = f + 1 veya f += 1
        f++;
        System.out.println(f);

        //"1" ile decrement
        int h = 10;
        System.out.println(h);
        //h = h - 1 veya h -= 1
        h--;
        System.out.println(h);

        //"post increment" ve "pre increment"

        int i = 10;
        int k = i++; //post-increment, variable in isminden sonra yazildi

        System.out.println(k); // i arttirilmadan k ya konnuldugu icin k 10 dur
        System.out.println(i); // i satir sonunda arttirildigi icin i 11 olur

        int m = 15;
        int n = ++m; //pre-increment, variable in isminden once yazildi

        System.out.println(m); // m arttirildiktan sonra n ye konuldugundan n 16 olur
        System.out.println(n); // m satir bittiginde arttirildigi icin 16 dir

        //"post decrement" ve "pre decrement"

        int p = 17;
        int r = p--;

        System.out.println(p);
        System.out.println(r);

        int s = 20;
        int t = --s;

        System.out.println(s);
        System.out.println(t);












    }
}
