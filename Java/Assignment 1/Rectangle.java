import java.util.Scanner;

class Rectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of rectangle: ");
		int length = sc.nextInt();
		System.out.print("Enter breadth of rectangle: ");
		int breadth = sc.nextInt();
		System.out.println("Perimeter of Rectangle is: "+(2*(length+breadth)));
		System.out.println("Area of Rectangle is: "+(length*breadth));
		sc.close();
	}
}
