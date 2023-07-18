package apnacollege;
import java.util.*;

public class Functions {
    public static void PrintMyName(String name) {
        System.out.println("You Name is : "+name);
        return;
    }


    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Please Enter Your Name : ");
        String Name = sc.nextLine();
        
        PrintMyName(Name);
        sc.close();
    }
}