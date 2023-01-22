import java.util.Scanner;

class TwoNumbers
{
   public static void main(String [] args)
   {
      int num1, num2,sum;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number 1 => ");
      num1 = sc.nextInt();
      num2 = sc.nextInt();
      System.out.print("Enter number 2=> ");
      sum = num1 + num2;
      System.out.println("\nThe sum of " + num1 + "and" + num2 + "is =>" + sum);
      sc.close();
   }
}

