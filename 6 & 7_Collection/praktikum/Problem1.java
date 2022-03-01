package praktikum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1 {
  public static void main(String[] args) {
    System.out.println(ArrayMerge(new String[] {"Muhammad", "Ilham", "Hidayat"}, new String[] {"Hidayat", "Academy"}));
    System.out.println(ArrayMerge(new String[] {"Ilham", "Hidayat"}, new String[] {"Ilham", "Merdeka"}));
  }

  static String ArrayMerge(String[] arrayA, String[] arrayB) {
    List<String> hasil = new ArrayList<String>(Arrays.asList(arrayA));
    for (String b : arrayB) {
      if(!hasil.contains(b)){
          hasil.add(b);
      }
    }
    return hasil.toString();
  }
}