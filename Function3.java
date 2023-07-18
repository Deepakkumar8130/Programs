package apnacollege;
import java.util.*;

public class Function3 {
    public static void CalculateFactorial(int a) {
        int factorial = 1;
        if (a < 0) {
            System.out.println("**********Invalid Input**********");
            return;
        }
        for (int i = a; i >= 1; i--) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of "+a+" is : "+factorial);
            return;
    }


    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        
        CalculateFactorial(n);
        sc.close();
    }
}