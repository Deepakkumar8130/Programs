package apnacollege;
// import java.util.*;

public class Sorting {
    public static void printSortedArray(int arr[]){
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
        int arr[] = {7,8,-3,1,2};

        // bubbleSort : Time Complexity = O(n^2)

        for (int i = 0; i<arr.length-1; i++){
            for (int j = 0; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }

        }
        printSortedArray(arr);

        // selectionSort : Time Complexity = O(n^2)
        
        // for (int i = 0; i<arr.length-1; i++) {
        //     int smallest = i;
        //     for (int j = i+1; j<arr.length; j++) {
        //         if (arr[smallest] > arr[j]) {
        //             smallest = j;
        //         }
        //     }
        //     int temp = arr[smallest];
        //     arr[smallest] = arr[i];
        //     arr[i] = temp;
        // }
        // printSortedArray(arr);

        // insertionSort :
         
        //  for (int i = 1; i<arr.length; i++) {
        //     int current = arr[i];
        //     int j = i-1;
        //     while(j >= 0 && current < arr[j]) {
        //         arr[j+1] = arr[j];
        //         j--;
        //     }
        //     arr[j+1] = current;
        //  }
        //  printSortedArray(arr);
    }
}