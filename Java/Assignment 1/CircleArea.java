import java.util.Scanner;

class CircleArea{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of circle: ");
		int radius = sc.nextInt();
		System.out.println("Area of circle is: "+(3.14*radius*radius));
		sc.close();
	}
}
