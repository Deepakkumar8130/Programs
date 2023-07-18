package apnacollege;
// import java.util.*;

public class recFact {

    public static int printFact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * printFact(n-1);
      
    }
    public static void main (String args[]) {
        int a = 5;
        System.out.println(printFact(a));
    }
}