package apnacollege;
// import java.util.*;

public class recEx7 {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str, int ind, String newString) {
        if(ind == str.length()) {
            System.out.println(newString);
            return;
        }
        if(map[str.charAt(ind) - 'a'] == true) {
            removeDuplicates(str, ind + 1, newString);
        } else {
            newString += str.charAt(ind);
            map[str.charAt(ind) - 'a'] = true;
            removeDuplicates(str, ind + 1, newString);
        }
    }
    public static void main (String args[]) {
        String str = "abbccda";
        removeDuplicates(str, 0,"");

    }
}