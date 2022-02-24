package praktikum;

import java.util.Scanner;
public class Task2 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String kata;
    int x=0;
    int o=0;
    System.out.println("Input :");
    kata = input.nextLine();
    for(int i=0; i<kata.length(); i++){
      if(kata.charAt(i)=='x'){
        x++;
      }else if(kata.charAt(i)=='o'){
        o++;
      }
    }
    System.out.println(x==o);
    input.close();
  }
}
