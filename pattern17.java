package apnacollege;

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=0; i<n-1; i++){
            for(int j=n-i; j<n; j++){
                System.out.print(" ");
            }

            for(int j=0; j<2*(n-i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
