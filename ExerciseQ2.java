package apnacollege;
import java.util.*;

public class ExerciseQ2 {
    public static void CalculateSumOdd(int a) {
        int sum = 0;
        for (int i = 1; i <= a;i++) {
            if (i%2 == 1) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of Odd Numbers From 1 to "+a+" is : "+sum);
        return;
    }


    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        
        CalculateSumOdd(n);
        sc.close();
    }
}