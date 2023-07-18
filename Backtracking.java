package apnacollege;


// import java.util.*;

// Time Complexity : (n*n!)
public class Backtracking {
    public static void printPermutation(String str, String perm) {
        if(str.length() == 0) {
            boolean ch = true;
            for(int i = 0; i<perm.length()-1; i++){
                if(perm.charAt(i) < perm.charAt(i+1)) {
                    ch = false;
                }
            }
            if(ch){
                System.out.println(perm);
            }
        }
        for (int i = 0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newstr, perm + currChar);

        }
    }
    public static void main(String args[]) {
        String str = "ABC";
        printPermutation(str, "");
    }
}