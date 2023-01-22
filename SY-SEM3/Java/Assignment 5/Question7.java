package series;
import series.*;
import java.util.Scanner;
class Question7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		
		Prime.printPrime(n);
		Fibonacci.printFibonacci(n);
		Perfect.printPerfect(n);
		sc.close();
	}
}
