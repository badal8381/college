import java.util.Scanner;
class Question8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		float radius = sc.nextFloat();
		System.out.print("Enter height: ");
		float height = sc.nextFloat();
		Cylinder c = new Cylinder(radius, height);

		System.out.println("Area of Cylinder: "+c.area(radius, height));
		System.out.println("Volume of Cylinder: "+c.volume(radius, height));
	}
}
