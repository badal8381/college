import java.util.*;
class Question5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		Rectangle r1 = new Rectangle();
		System.out.print("Enter Width of Rectangle 1: ");
		float width = sc.nextFloat();
		System.out.print("Enter Length of Rectangle 1: ");
		float length = sc.nextFloat();
		float area = length*width;
		System.out.print("Enter Color of Rectangle 1: ");
		String color = sc.next();
		r1.setWidth(width);
		r1.setLength(length);
		r1.setArea(area);
		r1.setColor(color);

		Rectangle r2 = new Rectangle();
		System.out.print("\nEnter Width of Rectangle 2: ");
		width = sc.nextFloat();
		System.out.print("Enter Length of Rectangle 2: ");
		length = sc.nextFloat();
		area = length*width;
		System.out.print("Enter Color of Rectangle 2: ");
		color = sc.next();
		r2.setWidth(width);
		r2.setLength(length);
		r2.setArea(area);
		r2.setColor(color);
		
		if(r1.getArea() == r2.getArea() && r1.getColor().compareTo(r2.getColor())==0)
			System.out.println("Matching Rectangles");
		else
			System.out.println("Non Matching Rectangles");	
		sc.close();
	}			
}
