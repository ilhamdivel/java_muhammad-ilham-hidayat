package praktikum;

import java.util.Scanner;
import java.lang.Math;

public class Task6 {
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int x,n;
    
    System.out.println("Input x :");
    x = input.nextInt();
    System.out.println("Input n :");
    n = input.nextInt();

    System.out.print("Output = "+(int)Math.pow(x, n));

    input.close();
  }
}
