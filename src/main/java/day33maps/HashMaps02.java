package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMaps02 {
    public static void main(String[] args) {
        //Example 1: Size verilen bir cumledeki herbir kelimenin kacar kere kullanildigini gosteren kodu yaziniz.
        //           "Java is easy. Java is OOP. OOP makes Java easy."

        HashMap<String , Integer>wordsMap = new HashMap<>();

        String sentence = "Java is easy. Java is OOP. OOP makes Java easy.";

        sentence.replaceAll("\\p{Punct}","");
        System.out.println(sentence);

        String[] wordsArray=sentence.split(" ");
        System.out.println(Arrays.toString(wordsArray));

        for(String w:wordsArray){
            Integer numOfOccurence=wordsMap.get(w);
            if(numOfOccurence==null){
                wordsMap.put(w,1);
            }else{
                wordsMap.put(w,numOfOccurence+1);
            }
        }
        System.out.println(wordsMap);




    }
}
