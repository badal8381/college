import java.util.Scanner;

class ArrayProduct{

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of objects to be created: ");
		int n = sc.nextInt();
		Product p[] = new Product[n];
		for(int i=0; i<n; i++){
			p[i] = new Product();
			System.out.print("Enter Product ID: ");
			p[i].product_id = sc.nextInt();
			System.out.print("Enter Product Name: ");
			p[i].product_name = sc.next();
			System.out.print("Enter Product Cost: ");
			p[i].product_cost = sc.nextFloat();
			System.out.print("Enter Product Quantity: ");
			p[i].product_quantity = sc.nextInt();
		}

		System.out.println("Before Sorting..");
		for(int i=0; i<p.length; i++){
			p[i].display();
		}
		// Sorting Product Array
		Product.sort(p);

		System.out.println("After Sorting..");
		for(int i=0; i<p.length; i++){
			p[i].display();
		}

		System.out.println("Product Class Object Count: "+ Product.count);
	}
}
