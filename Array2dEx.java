package apnacollege;

import java.util.*;

public class Array2dEx {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int number[][] = new int[rows][cols];
        System.out.println("Enter the Elements of Array : ");
        for (int i = 0; i<rows ;i++) {
            for (int j = 0; j<cols ;j++) {
                number[i][j] = sc.nextInt();      
            }
        }
        System.out.println("Enter the number Those you want search in array : ");
        int x = sc.nextInt();

        for (int i = 0; i<rows ;i++) {
            for (int j = 0; j<cols ;j++) {
                if (number[i][j] == x) {
                System.out.println(number[i][j]+" found  at index : {"+i+","+j+"}");
                }      
            }
        }
        sc.close();
    }
}