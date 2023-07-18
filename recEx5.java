package apnacollege;

// import java.util.*;

public class recEx5 {
    public static boolean isSort(int[] arr, int ind){
        if(ind == arr.length-1){
        return true;
    }

    if(arr[ind] < arr[ind + 1]){
        return isSort(arr,ind + 1);
    }
    else{
        return false;
    }    
    }
    public static void main (String args[]) {
    // Scanner sc = new Scanner (System.in);
    int arr[] = {0, 1, 2, 4, 5};
    boolean check = isSort(arr,0);
    if(check) {
        System.out.println("Array is Sorted in increasing order.");
    } else {
        System.out.println("Array is not Sorted in increasing order.");
    }
    }
}