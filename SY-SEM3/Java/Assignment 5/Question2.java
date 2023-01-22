import java.util.*;
class Question2{
	public static void sortProduct(Product arr[]){
		for(int i = 0; i<arr.length-1; i++){
			for(int j = i+1; j<arr.length; j++){
				if(arr[i].product_cost > arr[j].product_cost){
					Product temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of products: ");
		int n = sc.nextInt();
		Product p[] = new Product[n];
		for(int i=0; i<n; i++){
			p[i] = new Product();
			System.out.print("Enter product id: ");
			p[i].product_id = sc.nextInt();
			System.out.print("Enter product name: ");
			p[i].product_name = sc.next();
			System.out.print("Enter product cost: ");
			p[i].product_cost = sc.nextFloat();
			System.out.print("Enter product quantity: ");
			p[i].product_quantity = sc.nextInt();
		}

		System.out.print("\nBefore Sorting....\n");

		for(int i=0; i<p.length; i++){
			p[i].display();
		}
		sortProduct(p);

		System.out.print("\nAfter Sorting....\n");
		for(int i=0; i<p.length; i++){
			p[i].display();
		}
		sc.close();
	}
}

