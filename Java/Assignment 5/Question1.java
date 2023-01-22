import java.util.*;
class Question1{

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Product p1 = new Product();
		System.out.print("Enter product id: ");
		p1.product_id = sc.nextInt();
		System.out.print("Enter product name: ");
		p1.product_name = "Bat";
		System.out.print("Enter product cost: ");
		p1.product_cost = 200.0f;
		System.out.print("Enter product quantity: ");
		p1.product_quantity = 100;
		p1.display();
		Product p2 = new Product(2, "Ball", 50.5f, 50);
		p2.display();

		System.out.println("Product Class Object Count: "+ Product.count);
		sc.close();
	}
}

