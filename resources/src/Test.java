
import java.util.Scanner;

// A program that creates a pattern based on the number provided by the user.
public class Test {

    // A recursive method is created to obtain a pattern.
    static String meth(int n){
        if ( n == 0 || n<0){
            return n +"";
        }
        return n + " " + meth(n - 5) + " " + n;
    }
    // A number is taken from the user, and a pattern is obtained by calling a recursive method.
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int newNumber = inp.nextInt();

        System.out.println(meth(newNumber));
    }
}