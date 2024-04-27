package week1;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("This program calculates a combination: C(n,r)");
        System.out.println("Please enter n:");
        int n = scanner.nextInt();
        System.out.println("Please enter r:");
        int r = scanner.nextInt();


        int nFactorial = 1, rFactorial = 1, comboFactorial = 1, fin = n-r;


        for(int i=1; i<=n; i++){
            nFactorial = nFactorial * i;
        }
        for(int j=1; j<=r; j++){
            rFactorial = rFactorial * j;
        }
        for(int k = 1; k <=fin; k++){
            comboFactorial = comboFactorial * k;
        }
        int combination = nFactorial / (rFactorial * comboFactorial);
        System.out.println("Combination of " +n+ " and " +r+ " is: " +combination);


    }
}
