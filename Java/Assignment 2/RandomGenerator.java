import java.util.*;

public class RandomGenerator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		int arr[] = new int[n]; 
		for(int i=0; i<n; i++){
			arr[i] = r.nextInt(50);
		}

		int max = -9999;
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max)
				max = arr[i];
		}

		System.out.println("Maximum is: "+max);
		sc.close();
	}
}


