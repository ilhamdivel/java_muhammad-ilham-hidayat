package praktikum;

public class Problem2 {
  public static void main(String[] args) {
    System.out.println(pow(2, 3)); // 8
    System.out.println(pow(5, 3)); // 125
    System.out.println(pow(10, 2)); // 100
    System.out.println(pow(2, 5)); // 32
    System.out.println(pow(7, 3)); // 343
  }

  static Integer pow(Integer x, Integer n) {
    int i = 2;
    int hasil = x;
    if (n == 0) {
      return 1;
    }else {
      if(n%2 == 0){
        while(i<=n){
          hasil *= hasil;
          i *= 2;
        }

      }else {
        while(i <= n-1) {
          hasil *= hasil;
          i *= 2;
        }
        hasil *= x;
      }
    }
    return hasil;
  }
}