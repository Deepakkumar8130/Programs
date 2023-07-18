package apnacollege;
import java.util.*;

public class ExerciseQ3 {
    public static void CheckGreater(int a, int b) {
        
            if (a > b) {
                System.out.println("Greater Number is : "+a);
            }
            else {
                System.out.println("Greater Number is : "+b);
            }
        return;
    }


    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("*****Enter Two Number*****");
        System.out.print("Enter First Number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int n2 = sc.nextInt();
        
        CheckGreater(n1, n2);
        sc.close();
    }
}