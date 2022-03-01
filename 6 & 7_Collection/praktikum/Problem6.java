package praktikum;

public class Problem6 {
  public static void main(String[] args) {
    System.out.println(maxSum(new int[]{2,1,5,1,3,2},3));
    System.out.println(maxSum(new int[]{2,3,4,1,5},2));
  }

  static int maxSum(int[] arrayA, int k) {
    int max = 0;
    for (int i = 0; i < k; i++) {
      max += arrayA[i];
    }
    int temp = max;
    for (int i=1; i <= arrayA.length-k;i++) {
      temp = temp - arrayA[i-1] + arrayA[i+k-1];
      max = Math.max(temp, max);
    }
    return max;
  }
}
