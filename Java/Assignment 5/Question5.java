import java.util.*;
class Question5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("Menu..");
			System.out.println("1. Rectangle");
			System.out.println("2. Circle");
			System.out.println("3. Triangle");
			System.out.print("Enter Choice (-1 to stop): ");
			choice = sc.nextInt();

			switch(choice){
				case 1: Rectangle r = new Rectangle();
					System.out.print("Enter length: ");
					float length = sc.nextFloat();
					System.out.print("Enter Width: ");
					float width = sc.nextFloat();
					r.setLength(length);
					r.setWidth(width);
					System.out.println("Area of Rectangle: "+r.calculateArea());
					System.out.println("Perimeter of Rectangle: "+r.calculateCircumference());
					break;
				
				case 2: Circle c = new Circle();
					System.out.print("Enter Radius: ");
					float radius = sc.nextFloat();
					c.setRadius(radius);
					System.out.println("Area of Circle: "+c.calculateArea());
					System.out.println("Circumference of Circle: "+c.calculateCircumference());
					break;

				case 3: Triangle t = new Triangle();
					System.out.print("Enter Height: ");
					float height = sc.nextFloat();
					System.out.print("Enter Base: ");
					float base = sc.nextFloat();
					t.setHeight(height);
					t.setBase(base);
					System.out.println("Area of Triangle: "+t.calculateArea());
					System.out.println("Perimeter of Triangle: "+t.calculateCircumference());
					break;
			}
		}while(choice != -1);
		sc.close();
	} 
}
