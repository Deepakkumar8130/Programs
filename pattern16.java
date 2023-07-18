
package apnacollege;

public class pattern16{
    public static void main(String[] args) {
        int n = 10;

       for(int i=0; i<n; i++){

        for(int j=n; j>i; j--){
            System.out.print("* ");
        }
        
        for(int k=0; k<2*(2*i-1); k++){
            System.out.print(" ");
        }
        
        for(int j=n; j>i; j--){
            System.out.print("* ");
        }

        if(i<n-1){
            
            System.out.println();
        }
       }

       for(int i=n; i>=0; i--){

        for(int j=n; j>i; j--){
            System.out.print("* ");
        }
        
        for(int k=2*(2*i-1); k>0; k--){
            System.out.print(" ");
        }
        
        for(int j=n; j>i; j--){
            System.out.print("* ");
        }

        System.out.println();
       }

       
       
    }
}