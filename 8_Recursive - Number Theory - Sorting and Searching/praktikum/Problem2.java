package praktikum;

public class Problem2 {
  public static void main(String[] args) {
    for(int i = 0; i<10; i++){
      int result = fibonacci(i);
      System.out.print(result+ " ");
    }
  }

  public static Integer fibonacci(int input) {
    if (input == 0) {
      return 0;
    }
    if (input == 1) {
      return 1;
    }
    return fibonacci(input-1) + fibonacci(input-2);
  }
  
}
