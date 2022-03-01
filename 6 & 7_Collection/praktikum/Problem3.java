package praktikum;

import java.util.Arrays;
import java.util.HashMap;

public class Problem3 {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(PairSum(new int []{1,2,3,4,6}, 6)));
    System.out.println(Arrays.toString(PairSum(new int []{2,5,9,11}, 11)));
  }

  static int[] PairSum(int[] arr, int target) {
    HashMap<Integer,Integer> existingValue = new HashMap<Integer,Integer>();
    for (int i= 0; i < arr.length; i++ ) {
      int diff = target - arr[i];
      if(existingValue.containsKey(diff)) {
        int[] hasil = {existingValue.get(diff),i};
        return hasil;
      }else {
        existingValue.put(arr[i],i);
      }
    }
    return new int[]{};
  }
}
