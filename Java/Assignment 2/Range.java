import java.util.*;

public class Range{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the elements of array: ");
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		int min = 9999, max = -9999;

		for(int i=0; i<arr.length; i++){
			if(arr[i]<min)
				min = arr[i];
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println("Range is: "+(max-min));
		sc.close();
	}
}


