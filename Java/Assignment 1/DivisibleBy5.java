import java.util.Scanner;

class DivisibleBy5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		if(num%5==0)
			System.out.println(num+" is Divisible By 5");
		else
			System.out.println(num+" is not Divisible By 5");
		sc.close();
	}
}
