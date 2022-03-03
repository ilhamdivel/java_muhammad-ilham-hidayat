package praktikum;

public class Problem1 {
  public static void main(String[] args) {
    System.out.println(simpleEquations(1,2,3));
    System.out.println(simpleEquations(6,6,14));
  }

  static String simpleEquations(int A, int B, int C) {
    int one;
    int two;
    int three;
    for (int x= -100; x < 100; x++) {
      for(int y=-100; y < 100; y++) {
        if(x==y) {
          continue;
        }
        for (int z=-100; z<100; z++) {
          if(z==y || z==x) {
            continue;
          }
          one = x+y+z;
          two = x*y*z;
          three = x*x + y*y + z*z;
          if(one==A && two==B && three==C) {
            return x+" "+y+" "+z;
          }
        }
      }
    }
    return "No Solution";
  }
}