package praktikum;

public class Problem5 {
  public static void main(String[] args) {
    System.out.println(removeDuplicate(new int[] {2,3,3,3,6,9,9}));
    System.out.println(removeDuplicate(new int[] {2,2,2,11}));
  }

  static int removeDuplicate(int[] arrayA) {
    int size = 0;
    for (int i=0; i< arrayA.length; i++) {
      if(i < arrayA.length - 1) {
        if(arrayA[i] == arrayA[i+1]){
          continue;
        }
      }

      arrayA[size] = arrayA[i];
      size++;
    }
    return size;
  }
}
