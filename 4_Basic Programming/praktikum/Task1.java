package praktikum;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Task1 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String kata;
    int vokal = 0;
    int konsonan = 0;

    System.out.println("Input String :");
    kata = input.nextLine().toLowerCase();

    Character[] vokalArr = {'a','i','u','e','o'};
    List<Character> chars = Arrays.asList(vokalArr);
    for(int i=0; i< kata.length(); i++){
      if (chars.contains(kata.charAt(i))){
        vokal++;
      }else if(kata.charAt(i)!=' '){
        konsonan++;
      }
    }

    System.out.println("Jumlah Vokal : "+vokal);
    System.out.println("Jumlah Konsonan : "+konsonan);
    System.out.println("Jumlah Karakter : "+(vokal+konsonan));

    input.close();
  }
}