package praktikum;

import java.util.Scanner;
public class Task7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int bilangan, k = 0;
    System.out.println("Input Angka :");
    bilangan = input.nextInt();

    for (int i = 1; i <= bilangan; ++i, k = 0) {
      for (int space = 1; space <= bilangan - i; ++space) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }
    input.close();
  }
}
