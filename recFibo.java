package apnacollege;
import java.util.*;

public class recFibo {

    public static void printFibo(int a,int b,int n) {
        if (n == 0) {
            return ;
        }
        int c = a + b;
        System.out.print(c+" ");
        printFibo(b,c,n-1);
        
    }

      
    
    public static void main (String args[]) {
        int a = 0,b = 1;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the no. of Fibonacci Element : ");
        int n = sc.nextInt();
        if (n==0) {
            System.out.println("Invalid Input");
            System.exit(1);
        }
        else if (n == 1 || n == 2) {
            int i = n;
            while(i > 0){
                System.out.print(n-i+" ");
                i--;
                
            }
            System.exit(0);
        }
        System.out.print(a+" ");
        System.out.print(b+" ");
        
            
        printFibo(a,b,n-2);
        sc.close();
    }
}