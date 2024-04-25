import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        int year = input.nextInt();

        //formulating leap year.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - Bu bir artık yıldır!");
        } else {
            //if it's not a leap year, this is the another text option
            System.out.println(year + " Bu bir artık yıldır değildir!");
        }
    }
}