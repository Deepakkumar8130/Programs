package apnacollege;
import java.util.*;

public class Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String FirstName = "Deepak";
        String SecondName = "Kumar";
        String FullName = FirstName+"@"+SecondName;
        // System.out.println(FullName);

        // Length
        System.out.println(FullName.length());

        // charAT
        // for(int i=0; i<FullName.length(); i++) {
        //     System.out.println(FullName.charAt(i));
        // }

        // compare
        String str1 = "Tony";
        String str2 = "tony";

        if(str1.compareTo(str2) == 0) {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are  not equal");
        }
        sc.close();
    }
}