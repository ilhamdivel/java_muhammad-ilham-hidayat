package praktikum;
public class Problem1 {
  public static void main(String[] args) {
    System.out.println(primeNumber(1000000007));
    System.out.println(primeNumber(13));
    System.out.println(primeNumber(17));
    System.out.println(primeNumber(20));
    System.out.println(primeNumber(35));
  }

  static boolean primeNumber(Integer number) {
    if (number<2) {
      return false;
    }
    else {
      for (int i=2; i*i < number; i++) {
        if (number%i == 0){
          return false;
        }
      }
      return true;
    }

  }
}