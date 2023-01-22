import java.util.*;

public class Descending{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter elements of Array: ");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();

		System.out.print("Original Array: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<n; i++){
			for(int j=i; j<n; j++){
				if(arr[i]<arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.print("Sorted Array: ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sc.close();
	}
}


