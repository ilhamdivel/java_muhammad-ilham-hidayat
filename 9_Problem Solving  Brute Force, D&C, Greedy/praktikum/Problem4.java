package praktikum;

public class Problem4 {
  public static void main(String[] args) {
    System.out.println(binarySearch(new int[]{1,1,3,5,5,6,7},3));
    System.out.println(binarySearch(new int[] {12, 15, 15, 19, 24, 31, 53, 59, 60},100));

  }

  static int binarySearch(int[] array, int x) {
    int beg=0;
    int end = array.length-1;
    int mid=0;
    while(beg <= end) {
      mid = (beg + end)/2;
      if(x==array[mid]){
        return mid;
      }else if(x>array[mid]) {
        beg = mid+1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}
