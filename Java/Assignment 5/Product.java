class Product{
	int product_id;
	String product_name;
	float product_cost;
	int product_quantity;
	static int count = 0;

	Product(){
		product_id = 0;
		product_name = "";
		product_cost = 0.0f;
		product_quantity = 0;
		count++;
	}

	Product(int pid, String pname, float pcost, int pq){
		product_id = pid;
		product_name = pname;
		product_cost = pcost;
		product_quantity = pq;
		count++;
	}

	public void display(){
		System.out.println("Product Details are: ");
		System.out.println("Product ID: "+ product_id);
		System.out.println("Product Name: "+ product_name);
		System.out.println("Product Cost: "+ product_cost);
		System.out.println("Product Quantity: "+ product_quantity);
	}
}
