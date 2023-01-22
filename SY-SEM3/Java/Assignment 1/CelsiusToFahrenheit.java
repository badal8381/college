import java.util.Scanner;

class CelsiusToFahrenheit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature in Celsius: ");
		float c = sc.nextFloat();
		System.out.println("Temperature in Farhenheit: "+ ((c*9/5)+32));
		sc.close();
	}
}
