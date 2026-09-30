package exception;

import java.util.Scanner;

public class TryCatchFinally2 {
    public static void main(String[] args) {
        System.out.println("Multi Atoms");
        try {

            System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.printf("Exception occurs");
            System.out.println();
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println(" finally  runs");
        }
        System.out.println("Multi Atoms plus");
    }
}
