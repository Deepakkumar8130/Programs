package apnacollege;
// import java.util.*;

public class recEx8 {
    public static boolean[] map = new boolean[26];
    public static void subsequences(String str, int ind, String newString) {
        if(ind == str.length()) {
            System.out.println(newString);
            return;
        }
        subsequences(str, ind + 1, newString + str.charAt(ind));
        subsequences(str, ind + 1, newString);
    }
    public static void main (String args[]) {
        String str = "abc";
        subsequences(str, 0,"");

    }
}