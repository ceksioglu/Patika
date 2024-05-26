package week5;

import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir metin girin :");
        String inputText = scanner.nextLine();

        String[] words = inputText.split("\\s+");

        HashMap<String,Integer> wordCountMap = new HashMap<>();

        System.out.println("Girilen kelimeler :");
        for(String splitWord : words){
            System.out.print(splitWord + " ");
            splitWord = splitWord.toLowerCase();
            if (wordCountMap.containsKey(splitWord)){
               // wordCountMap.put(splitWord.get)
            }else {
                wordCountMap.put(splitWord,1);
            }
        }



    }
}
