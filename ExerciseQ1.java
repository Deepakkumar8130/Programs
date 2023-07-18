package apnacollege;
import java.util.*;

public class ExerciseQ1 {
    public static float CalculateAverage(float a, float b, float c) {
        float average = (a + b + c)/3;
        return average;
    }


    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Three Number : ");
        float n1 = sc.nextInt();
        float n2 = sc.nextInt();
        float n3 = sc.nextInt();
        
        System.out.println("Average is : "+CalculateAverage(n1, n2, n3));
        sc.close();
    }
}