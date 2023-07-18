package apnacollege;
import java.util.*;

public class recEx4 {
    public static int firstind = -1;
    public static int lastind = -1;
    public static void findOccurance(String str, int ind, char element){
        if(ind == str.length()){
            System.out.println("First Occurance of element "+element+" is : "+firstind);
            System.out.println("Last Occurance of element "+element+" is : "+lastind);
        return;
        }
        if(str.charAt(ind) == element) {
            if(firstind == -1){
                firstind = ind;
            } else {
                lastind = ind;
            }
            
        }
        findOccurance(str,ind + 1,element);
    }
    public static void main (String args[]) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter a string : ");
    String str = sc.nextLine();
    System.out.print("Enter a char : ");
    char element = sc.next().charAt(0);
    findOccurance(str,0,element);
    sc.close();
    }
}