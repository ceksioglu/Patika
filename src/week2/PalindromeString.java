package week2;

import java.util.Scanner;

public class PalindromeString {

        static boolean isPalindrome(String str) {
            int i = 0, j = str.length() - 1;
            while (i < j) {
                if (str.charAt(i) != str.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
        }

        static boolean isPalindrome2(String str) {
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);
            }

            if (str.equals(reverse)){
                System.out.println("Bu kelime palindromiktir.");
                return true;
            } else
                return false;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen kelimeyi girin: ");
            String name = scanner.next();
            System.out.println(isPalindrome(name));
        }
    }
