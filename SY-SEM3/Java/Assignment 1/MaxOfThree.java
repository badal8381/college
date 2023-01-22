import java.util.Scanner;

class MaxOfThree{
     public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter first number: ");
           int num1 = sc.nextInt();
           System.out.print("Enter second number: ");
           int num2 = sc.nextInt();
           System.out.print("Enter third number: ");
           int num3 = sc.nextInt();


          if(num1>num2 && num1>num3)
              System.out.println(num1+"is Greater");
          if(num2>num1 && num2>num3)
              System.out.println(num2+ " is Greater");
          else 
              System.out.println(num3+ " is Greater");
          sc.close();
      }
}
