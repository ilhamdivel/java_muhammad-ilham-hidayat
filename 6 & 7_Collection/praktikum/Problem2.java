package praktikum;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
  public static void main(String[] args) {
    System.out.println(angkaMunculSekali("76523752"));
    System.out.println(angkaMunculSekali("1122"));
  }

  static String angkaMunculSekali(String input) {
    List<Integer> munculSekali = new ArrayList<Integer>();
    List<Integer> lebihSekali = new ArrayList<Integer>();

    for (int i=0; i<input.length(); i++) {
      int angka = Character.getNumericValue(input.charAt(i));
      if(lebihSekali.contains(angka)){
        continue;
      }else if(munculSekali.contains(angka)){
        munculSekali.remove(Integer.valueOf(angka));
        lebihSekali.add(angka);
      }else{
        munculSekali.add(angka);
      }

    }
    return munculSekali.toString();
  }
}
