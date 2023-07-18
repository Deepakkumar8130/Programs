package apnacollege;

import java.util.*;

public class ArrayEx {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        int number[] = new int[size];

        System.out.println("Enter the Elements of Array : ");
        for (int i =0; i<size ;i++) {
            number[i] = sc.nextInt();      
        }

        System.out.println("Enter the number Those you want search in array : ");
        int x = sc.nextInt();
        
        for ( int i = 0; i<number.length; i++) {
            if (number[i] == x) {
                System.out.println(number[i]+" found  at index : "+i);
                }
        }
        sc.close();
    }
}