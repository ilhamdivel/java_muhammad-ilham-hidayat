package praktikum;
import java.util.HashMap;

public class Problem1 {
  public static void main(String[] args) {
    System.out.println(fiboTopDown(14));
  }

  static HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
  public static int fiboTopDown(int n) {
    if(memo.containsKey(n)) return memo.get(n);
    if(n == 0) return 0;
    if(n == 1) return 1;
    int nthValue = fiboTopDown(n - 1) + fiboTopDown(n - 2);
    memo.put(n, nthValue);
    return nthValue;
  }
}

