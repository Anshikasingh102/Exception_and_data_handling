package exception;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.println("Please enter your two numbers");
        int x= input.nextInt();
        int y= input.nextInt();
       try {

           int[]a=new int[5];
           System.out.printf("result is %d",a[6]);
           int result = x / y;
           System.out.printf("%d", result);
       } catch (ArithmeticException exception) {
           System.out.printf("%s,please enter a valid number",exception.getMessage());
       }
       catch (Throwable th){
           System.out.println("genral exception");
       }
        finally {
           System.out.println("not quite finally");
       }
    }
}
