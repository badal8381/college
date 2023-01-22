import java.util.Scanner;

class FahrenheitToCelsius{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature in Farhenheit: ");
		float f = sc.nextFloat();
		System.out.println("Temperature in Farhenheit: "+ ((f-32)*5/9));
		sc.close();
	}
}
