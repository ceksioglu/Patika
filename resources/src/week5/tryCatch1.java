package week5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch1 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 20;
        int c;
        int[] arr = new int[5];
        try {
            System.out.println("Start block:");
            c = scanner.nextInt();
            arr[7]=10;
            System.out.println(b / a);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage()); //Error bastır. e = Exception'a veridiğin isim.
        } catch (InputMismatchException e){
            System.out.println("Wrong data type");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array error;");
        } finally {
            System.out.println("Final");
        }

        System.out.println("End");

    }

}
