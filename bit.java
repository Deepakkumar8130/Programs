package apnacollege;
import java.util.*;

public class bit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Enter a position : ");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;

        // Get bit :
        if((bitMask & n) == 0) {
            System.out.println("The Bit is : 0");
        } else {
            System.out.println("The Bit is : 1");
        }

        // Set bit :
        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        // Clear bit :
        // int newNumber = ~(bitMask) & n;
        // System.out.println(newNumber);

        // Update bit :
        // System.out.print("Enter The Update Bit :  ");
        // int oper = sc.nextInt();
        // if(oper == 1){
        //     int newNumber = bitMask | n;
        //     System.out.println(newNumber);
        // } else {
        //     int newNumber = ~(bitMask) & n;
        //     System.out.println(newNumber);
        // }
        sc.close();
    }
}