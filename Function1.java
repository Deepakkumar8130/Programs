package apnacollege;
import java.util.*;

public class Function1 {
    public static int CalculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }


    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Two Number : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int result = CalculateSum(n1, n2);
        System.out.println("Sum of Two Numbers is : "+result);
        sc.close();
    }
}