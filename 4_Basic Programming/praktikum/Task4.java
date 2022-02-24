package praktikum;

import java.util.Scanner;

public class Task4 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int bilangan;
    int cek=0;

    System.out.println("Input Angka");
    bilangan = input.nextInt();

    for(int i=1; i<=bilangan; i++)
    {
      if (bilangan%i == 0)
      {
        cek++;
      }
    }

    if (cek==2){
      System.out.println("Bilangan Prima");
    } else {
      System.out.println("Bukan Bilangan Prima");
    }
    input.close();
  }
}