package apnacollege;
// import java.util.*;

public class recAEx13 {
    public static int placeTiles(int n, int m) {
        if(n == m) {
            return 2;
        }
        if(n < m){
            return 1;
        }
        int verticalWays = placeTiles(n-m, m);

        int horizontalWays = placeTiles(n-1, m);

        return verticalWays + horizontalWays;
        
    }
    public static void main (String args[]) {
        int n = 4, m = 2;
        int totalWays = placeTiles(n, m);
        System.out.println(totalWays);
    }
}