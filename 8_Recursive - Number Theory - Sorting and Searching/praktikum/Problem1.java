package praktikum;

import java.util.Scanner;

public class Problem1 {
  public static void main(String[] args) {
    int number,result;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input : ");
    number = scanner.nextInt();
    result = primeX(number);
    System.out.println("Output : " +result);

    scanner.close();
  }

  public static int primeX (int input)
  {
    int count=0,flag=0;
    for(int i=2;i>0;i++)
    {
      flag = 0;
      for(int j=2; j<i; j++)
      {
        if(i%j==0)
        {
          flag = 1;
          break;
        }
      }
      if(flag==0)
      {
        count++;
      }
      if(count==input)
      {
        return i;
      }
    }
    return 0;
  }
  
}