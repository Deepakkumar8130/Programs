package apnacollege;
import java.util.*;

public class ExerciseQ6 {
    public static void CheckGreaterCommonDivisor(int a, int b) {    int checker;
            boolean ch = true;
            if (a > b) {
                checker = b;
               while(ch) {
                    if (a%checker==0 && b%checker==0) {
                        ch = false;
                    }
                    else {
                        checker--;
                    }
               }
            }
            else {
                  checker = a;
               while(ch) {
                    if (a%checker==0 && b%checker==0) {
                        ch = false;
                    }
                    else {
                        checker--;
                    }
            }
    }
    if(checker==1) {
        System.out.println("Not Found");
    }
    else {
     System.out.println("Greatest Common Divisor is : "+checker);
    }
}


    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("*****Enter Two Number*****");
        System.out.print("Enter First Number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int n2 = sc.nextInt();
        
        CheckGreaterCommonDivisor(n1, n2);
        sc.close();
    }
}