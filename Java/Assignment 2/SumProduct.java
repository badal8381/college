import java.util.*;

public class SumProduct{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter elements of Array: ");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();

		int sum = 0, product = 1;

		for(int i=0; i<n; i++){
			sum+=arr[i];
			product = product * arr[i];
		}

		System.out.println("Sum is: "+sum);
		System.out.println("Product is: "+product);
		sc.close();
	}
}


