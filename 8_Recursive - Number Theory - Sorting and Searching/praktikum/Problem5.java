package praktikum;

import java.util.Arrays;

public class Problem5 {
  public static void main(String[] args) {
    String[] name = {"js", "js", "golang", "ruby", "ruby", "js", "js"};
    System.out.println(mostAppearItem(name));
  }

  static String mostAppearItem(String[] array) {
    Arrays.sort(array);
    int count = 1;
    String result = "";

    for(int i=1; i< array.length;i++) {
      if(array[i].equals(array[i-1])) {
        count++;
      } else {
        result = result + array[i-1]+ " = " + count+ ", ";
        count=1;
      }
    }

    if(array[array.length-1].equals(array[array.length-2])) {
      result = result + array[array.length-1] + " = " +count;
    } else {
      result = result + array[array.length-1] + " = " +1;
    }
    return result;
  }

}
