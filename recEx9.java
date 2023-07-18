package apnacollege;
import java.util.*;

public class recEx9 {
    public static boolean[] map = new boolean[26];
    public static void subsequences(String str, int ind, String newString, HashSet<String> set) {
        if(ind == str.length()) {
            if(set.contains(newString)) {
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        subsequences(str, ind + 1, newString + str.charAt(ind), set);
        subsequences(str, ind + 1, newString, set);
    }
    public static void main (String args[]) {
        HashSet<String> set = new HashSet<>();
        String str = "aaa";
        subsequences(str, 0,"",set);

    }
}