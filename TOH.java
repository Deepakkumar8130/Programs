package apnacollege;

import java.util.*;

public class TOH {

    public static void towerOfHanoi(int n, String scr, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disc "+ n +" from "+scr+" to "+dest);
            return;

        }
        towerOfHanoi(n-1, scr, dest, helper);
        System.out.println("Transfer disc "+ n +" from "+scr+" to "+dest);
        towerOfHanoi(n-1, helper, scr, dest);
        
      
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the no of disc : ");
        int n = sc.nextInt();
        towerOfHanoi(n, "S", "H", "D");
        sc.close();
    }
}