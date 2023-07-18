package apnacollege;
import java.util.*;
// import java.lang.Math.*;

public class ExerciseQ4 {
    public static double CalculateAverage(double rad) {
        double Circumference = Math.PI*rad*rad;
        return Circumference;
    }


    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Radius : ");
        double radius = sc.nextInt();
        
        System.out.println("Circumference of Circle is : "+CalculateAverage(radius));
        sc.close();
    }
}