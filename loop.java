package apnacollege;
import java.util.*;

public class loop {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);


        // For loop
        System.out.println("Enter The Number : ");
        int nf = sc.nextInt();
        int sumf = 0;
        for(int i = 0; i <= nf; i++) {
            sumf = sumf + i;
        }
        System.out.println("Sum is : "+sumf+" By For Loop.");


        // while loop
        System.out.println("Enter The Number : ");
         int nw = sc.nextInt();
        int sumw = 0;
        int j = 0;
        while( j <= nw) {
            sumw = sumw + j;
            j++; 
        }
        System.out.println("Sum is : "+sumw+" By While Loop.");


        // Do-While loop
        System.out.println("Enter The Number : ");
         int ndw = sc.nextInt();
        int sumdw = 0;
        int k = 0;
        do {
            sumdw = sumdw + k;
            k++; 
        }while( k <= ndw);
        System.out.println("Sum is : "+sumdw+" By Do While Loop.");
        sc.close();
    }
}