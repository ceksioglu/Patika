package week5;

import java.util.Scanner;

public class tryCatch1 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 20;
        int c;
        try {
            System.out.println("Start block:");
            System.out.println(b / a);
        } catch (Exception e){
            System.out.println(e.getMessage()); //Error bastır. e = Exception'a veridiğin isim.
        }

        System.out.println("End");

    }

}
