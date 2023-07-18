package apnacollege;
// import java.util.*;

public class recEx6 {
    public static void moveAllX(String str, int ind, int count, String newString) {
        if(ind == str.length()) {
            while(count > 0){
                newString += 'x';
                count--;
            }
            System.out.println(newString);
            return;
        }
        if(str.charAt(ind) == 'x') {
            count++;
            moveAllX(str, ind + 1, count, newString);
        }
        else {
            newString += str.charAt(ind);
            moveAllX(str,ind + 1, count, newString);
        }
    }
    public static void main (String args[]) {
        String str = "axbcxxd";
        moveAllX(str, 0, 0, "");

    }
}