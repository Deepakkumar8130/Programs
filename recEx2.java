package apnacollege;
import java.util.*;

public class recEx2 {

    public static int calcPow(int x, int n) {
        
        if(n == 0) {
            return  1;
        }
        if(x == 0) {
            return  0;
        }
        if(n % 2 == 0){
            return calcPow(x, n/2) * calcPow(x, n/2);
        }
        else {
            return calcPow(x, n/2) * calcPow(x, n/2) * x;
        }
        
      
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of x and n : ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        
        System.out.println(calcPow(x, n));
        sc.close();
    }
}