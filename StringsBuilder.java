package apnacollege;
// import java.util.*;

public class StringsBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        StringBuilder sb1 = new StringBuilder("H");

        System.out.println(sb);

        // char at index 2 :
        System.out.println(sb.charAt(2));

        // char replace :
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // char add :
        sb.insert(2, "n");
        System.out.println(sb);

        // char delete :
        sb.delete(2,3);
        System.out.println(sb);

        // char append in sb1 :
        sb1.append("e");
        sb1.append("l");
        sb1.append("l");
        sb1.append("o");
        System.out.println(sb1);

        // for length :
        System.out.println(sb.length());
        System.out.println(sb1.length());




    }
}