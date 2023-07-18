package apnacollege;
import java.util.*;

public class ExerciseQ5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Numbers do you wants to check : "); 
        int num = sc.nextInt();
        System.out.println("Enter a Numbers : "); 
        int countP = 0;
        int countN = 0;
        int countZ = 0;

        while(num>0) {
            int n = sc.nextInt();
            if (n > 0)
                countP++;
            else if (n < 0)
                countN++;
            else
                countZ++;
            num--;
        }
        System.out.println("Number of Positive Numbers : "+countP+"\n"+"Number of Negative Numbers : "+countN+"\n"+"Number of Zeros : "+countZ);
        
        sc.close();
    }
}