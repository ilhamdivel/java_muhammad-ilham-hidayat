package praktikum;

import java.util.Scanner;
public class Task8 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    int bilangan;

    System.out.print("Input Angka : ");
    bilangan = input.nextInt();

    for(int i=1; i<=bilangan; i++){
      for(int j=1;j<= bilangan; j++){
        System.out.print(" "+ i*j +"\t");
      }

      System.out.println("\n\n");
    }
    input.close();
  } 
}
