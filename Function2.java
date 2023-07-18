package apnacollege;
import java.util.*;

public class Function2 {
    public static int CalculateProduct(int a, int b) {
        int product = a * b;
        return product;
    }


    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Two Number : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        System.out.println("Product of Two Numbers is : "+CalculateProduct(n1, n2));
        sc.close();
    }
}