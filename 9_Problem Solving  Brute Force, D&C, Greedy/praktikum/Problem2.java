package praktikum;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
  public static void main(String[] args) {
    System.out.println(moneyChange(100).toString());
    System.out.println(moneyChange(432).toString());
  }

   static List<Integer> moneyChange(int amount) {
    int[] price= new int[] {1,10,20,50,100,200,500,1000,2000,5000,10000};
    
    List <Integer> result = new ArrayList<Integer>();

    for(int i= price.length -1; i>=0; i-- ) {
      if(amount >= price[i]) {
        int div = amount / price[i];
        for (int j=0; j<div; j++){
          result.add(price[i]);
          amount = amount - price[i];
        }
      }
    }
    return result;
  }
}
