package apnacollege;
// import java.util.*;

public class palindromeString {
    public static void checkPalindromeString(String str) {
        int i = 0;
        int j = str.length() - 1;
        
        while(str.length()/2 > 0) {
            if(i == j || i > j) {
                if(i == j) {
                    System.out.println("Middle index : "+i+" and "+j+" is "+str.charAt(i));
                }
                System.out.println("Palindrome");
                return;
            }
            System.out.println("index : "+i+" and "+j+" is "+str.charAt(i)+" and "+str.charAt(j));
            if(str.charAt(i) != str.charAt(j)) {
                System.out.println("Not Palindrome");
                return;
            }
            i++;
            j--;
        }
        
    }
    public static void main (String args[]) {
        String str = "abcdedcba";
        checkPalindromeString(str);

    }
}