package fibonacciZahlen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie als Zahl an, die wievielte Finbonaci Zahl Sie haben möchten");
        int eingabe = scanner.nextInt();
        int f0 = 0;
        int f1 = 1;
        int f2 = f0 + f1;
        System.out.println("Die vorherigen Fibonacci Zahlen ab der 2. Fibonacci Zahl lauten:");

        if (eingabe >= 2) {


            for (int i = 2; i <= eingabe; i++) {
                f2 = f0 + f1;
                f0 = f1;
                f1 = f2;
                if (i < eingabe) {
                    System.out.print(f2 + ", ");

                }
            }

            System.out.println();
            System.out.println();
            System.out.println("Die " + eingabe + ". Fibonacci Zahl lautet: " + f2);


        }


    }
}
