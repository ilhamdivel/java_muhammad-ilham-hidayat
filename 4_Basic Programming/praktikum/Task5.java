package praktikum;

import java.util.Scanner;

public class Task5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String kata;
    String kataPalindrom ="";
    int panjangKata;

    System.out.print("Input Kata :");
    kata = input.nextLine();
    panjangKata = kata.length();

    for(int i= panjangKata -1; i>= 0;i--){
      kataPalindrom = kataPalindrom + kata.charAt(i);
    }

    if(kata.equals(kataPalindrom)){
      System.out.println("Palindrom");
    } else{
      System.out.println("Bukan Palindrom");
    }
    input.close();
  }
}
