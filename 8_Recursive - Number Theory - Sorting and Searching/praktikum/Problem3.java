package praktikum;


public class Problem3 {
  public static void main(String[] args) {
    int[] array = new int[] {5,7,4,-2,-1,8};
    getMin(array);
    getMax(array);
  }

  public static void getMin(int[] array) {
    int min = array[0];
    int indexMin=0;
    for (int i=0; i< array.length; i++) {
      int value = array[i];
      if(min > value) {
        min = value;
        indexMin = i;
      }
    }
    System.out.println("Min : "+min);
    System.out.println("Index : "+indexMin);
  }

  public static void getMax(int[] array) {
    int max = array[0];
    int indexMax = 0;
    for (int i = 0; i < array.length; i++) {
        int value = array[i];
        if (max < value) {
            max = value;
            indexMax = i;
        }
    }
    System.out.println("Max : "+max);
    System.out.println("Index : "+indexMax);
}
  // public static void findMinMax(int[] array) {
  //   int minimum = array[0];
  //   int maximum = array[0];

  //   for(int value : array) {
  //     if (value < minimum) {
  //       minimum = value;
  //     }
  //     if (value > maximum) {
  //       maximum = value;
  //     }
  //   }
  //   System.out.println("Min : "+minimum);
    
  //   System.out.println("Max : "+maximum);
    
  // }
}
