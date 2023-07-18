package apnacollege;
import java.util.*;

public class loop1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
       
        // For loop
        System.out.println("Enter The Number : ");
        int nf = sc.nextInt();
        System.out.println("By For Loop : ");
        for(int i = 1; i <= 10; i++) {
            System.out.println(nf+" * "+i+" = "+nf*i);
        }



        // while loop
        System.out.println("Enter The Number : ");
        int nw = sc.nextInt();
        System.out.println("By While Loop : ");
        int j = 1;
        while( j <= 10) {
            System.out.println(nw+" * "+j+" = "+nw*j);
            j++; 
        }
        


        // Do-While loop
        System.out.println("Enter The Number : ");
        int ndw = sc.nextInt();
        System.out.println("By Do-While Loop : ");
        int k = 1;
        do {
            System.out.println(ndw+" * "+k+" = "+ndw*k);
            k++; 
        }while( k <= 10);
        sc.close();
    }
}