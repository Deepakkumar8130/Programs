package apnacollege;
import java.util.*;

public class ExerciseQ7 {
    public static void Fibonacci(int n) {
        int a = 0;
        int b = 1;
            if (n == 0) {
                System.out.println("Invalid Input");
            }
            else if (n == 1) {
                System.out.println("Fibonacci Series : "+a);
            }
            else if (n == 2) {
                System.out.println("Fibonacci Series : "+a+" "+b);

            }
            else {
                System.out.print("Fibonacci Series : "+a+" "+b);
                int c = a + b;
                for (int i = 1;i <= n-2;i++) {
                     System.out.print(" "+c);
                     a = b;
                     b = c;
                     c = a + b;

                }

            }
        return;
    }


    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter The Number : ");
        int n = sc.nextInt();
        
        Fibonacci(n);
        sc.close();
    }
}