package apnacollege;

public class Queen1 {
  public static final int N = 4;
  static int[] x = new int[N+1];
  public static void main(String[] args) {
    int k = 1;
    x[1] = 0;
    while(k != 0) {
      x[k] = x[k]+1;
      while((x[k] <= N) && !place(k)) {
        x[k] = x[k]+1;
      }
      if(x[k] <= N) {
        if(k == N) {
          System.out.println("Solution: ");
          for(int i = 1; i <= N; i++) {
            System.out.println(i + " " + x[i]);
          }
        } else {
          k++;
          x[k] = 0;
        }
      } else {
        k--;
      }
    }
  }
  public static boolean place(int k) {
    for(int i = 1; i < k; i++) {
      if((x[i] == x[k]) || (Math.abs(x[i]-x[k]) == Math.abs(i-k))) {
        return false;
      }
    }
    return true;
  }
}