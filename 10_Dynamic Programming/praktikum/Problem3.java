package praktikum;

public class Problem3 {
  public static void main(String[] args) {
    System.out.println(frog(new int[]{30, 10, 60, 10, 60, 50}));
    System.out.println(frog(new int[]{30, 30}));
  }
  
  public static int frog(int[] stoneHeight) {
    int[] minCost = new int [stoneHeight.length];
    minCost[0] = 0;
    minCost[1] = Math.abs(stoneHeight[0] - stoneHeight[1]);

    for (int i=2; i< minCost.length;i++) {
      int oneJump = minCost[i-1] + Math.abs(stoneHeight[i-1] - stoneHeight[i]);
      int twoJump = minCost[i-2] + Math.abs(stoneHeight[i-2] - stoneHeight[i]);
      minCost[i] = Math.min(oneJump, twoJump);
    }
    return minCost[stoneHeight.length-1];
  }
}
