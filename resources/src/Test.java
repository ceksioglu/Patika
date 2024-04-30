public class Test {

    public static void main(String[] args) {

        recursiveMethod(4);

    }


    static void recursiveMethod(int num) {

        num--;

        if (num == 0)

            return;

        System.out.print(num + ",");

        recursiveMethod(num);

    }

}