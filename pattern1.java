package apnacollege;
import java.util.*;

public class pattern1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}