package apnacollege;

import java.util.*;

public class conditional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Both Are Equal!");
        } else {
            if(a > b) {
                System.out.println("First Number Is Greater!");
            } else {
                System.out.println("Second Number Is Greater!");
            }
            sc.close();
        }
    }
}