package praktikum;

import java.util.Arrays;

public class Problem4 {
  public static void main(String[] args) {
    // int price[] = {25000,25000,10000,14000};
    // int money = 50000;

    int price[] = {15000,10000,12000,5000,3000};
    int money = 30000;
    System.out.println(maxBuy(price, money));
  }

  static int maxBuy(int price[], int money) {
    int count =0, total=0;

    Arrays.sort(price);
    for (int i=0; i< price.length;i++) {
      if (total +price[i] <= money) {
        total = total + price[i];
        count++;
      }
    }
    return count;
  }
}
