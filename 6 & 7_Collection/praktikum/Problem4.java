package praktikum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem4 {
  public static void main(String[] args) {
    System.out.println(arrayUnique(new Integer[]{1,2,3,4},new Integer[]{1,3,5,10,16}).toString());
    System.out.println(arrayUnique(new Integer[]{3,8}, new Integer[]{2,8}).toString());
  }

  static List<Integer> arrayUnique(Integer[] arrayA, Integer[] arrayB) {
    List<Integer> hasil = new ArrayList<>(Arrays.asList(arrayA));
    for (Integer b : arrayB) {
      if(hasil.contains(b)){
        hasil.remove(b);
      }
    }
    return hasil;
  }
}
