package week5;

import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        // Kullanıcıdan metin almak için Scanner nesnesi oluşturuluyor
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan metin isteniyor
        System.out.println("Please enter a text:");
        String inputText = scanner.nextLine();

        // Metni kelimelere ayırma (\\W+ ile)
        String[] words = inputText.split("\\W+");

        // Kelime frekanslarını tutmak için bir HashMap oluşturuluyor
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Her bir kelimenin frekansını hesaplama
        for (String splitWord : words) {
            // Kelimeyi küçük harflere çevirerek (case-insensitive) hesaplarken birleştirme sağlıyoruz
            splitWord = splitWord.toLowerCase();
            if (wordCountMap.containsKey(splitWord)) {
                wordCountMap.put(splitWord, wordCountMap.get(splitWord) + 1);
            } else {
                wordCountMap.put(splitWord, 1);
            }
        }

        // Kelime frekanslarını ekrana yazdırma
        System.out.println("Word frequencies:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }

        // Scanner nesnesini kapatma
        scanner.close();
    }
}
