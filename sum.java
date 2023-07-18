package apnacollege;
import java.util.*;

public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.printf("Sum is a + b : %d",sum);
        sc.close();
    }
}