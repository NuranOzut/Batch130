package day18lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists02 {
    public static void main(String[] args) {
        //Example1) Bir tane Integer List olusturun, Bu Liste te birbirine en yakin iki tamsayiyi bulunuz
        //[12, 23,9,11,35] ==> 12,11

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(9);
        nums.add(11);
        nums.add(35);
        Collections.sort(nums);
        System.out.println(nums);

        int minDiff= nums.get(1)- nums.get(0);




    }
}
