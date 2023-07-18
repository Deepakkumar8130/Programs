package apnacollege;
import java.util.*;

public class recEx3 {
    public static void reverseString(String str, int ind){
        if(ind == 0) {
            System.out.print(str.charAt(ind));
            return;
        }
        System.out.print(str.charAt(ind));
        reverseString(str,ind-1);
    }
    public static void main (String args[]) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter a string : ");
    String str = sc.nextLine();
    reverseString(str,str.length()-1);
    sc.close();
    }
}