package praktikum;

public class Problem2 {
  public static void main(String[] args) {
    
    System.out.println(fiboBottomUp(5));
  }

  public static int fiboBottomUp(int n) {
    if (n == 0 || n == 1) return n;
    
    int n1 = 0;
    int n2 = 1;
    int sum = 0;
    for(int i=2; i<=n;i++) { // 0 1 1 2 3 5 
      sum = n1 + n2;
      n1 = n2;
      n2 = sum;
    }
    return sum;
  }
 
}
