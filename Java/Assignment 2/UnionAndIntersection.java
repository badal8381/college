import java.util.*;

public class UnionAndIntersection{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("Enter size of 1st array: ");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		System.out.print("Enter size of 2nd array: ");
		int m = sc.nextInt();
		int arr2[] = new int[m];
		int union[] = new int[n+m];
		int min = (n > m) ? n : m;
		int intersection[] = new int[min];
		int u=0, p=0;
		
		//Generating 1st array
		for(int i=0; i<n; i++){
			arr1[i] = r.nextInt(m+n);
		}

		//Generating 2nd array
		for(int i=0; i<m; i++){
			arr2[i] = r.nextInt(m+n);
		}

		System.out.print("1st Array: ");
		for(int i=0; i<n; i++){
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		System.out.print("2nd Array: ");
		for(int i=0; i<m; i++){
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		//Intersection
		for(int i=0; i<n; i++){	
			for(int j=i; j<m; j++){	
				if(arr1[i] == arr2[j])
					intersection[p++] = arr2[j];
			}
		}
		
		//Union
		for(int i=0; i<n; i++){	
			union[u++] = arr1[i];
		}
		for(int i=0; i<m; i++){	
			union[u++] = arr2[i];
		}
		
		HashSet<Integer> uni = new HashSet<>();
		for(int i=0; i<u; i++){
			uni.add(union[i]);
		}

		System.out.print("Union Array: ");
		for(Integer a: uni){
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.print("Intersection Array: ");
		for(int i=0; i<p; i++){
			System.out.print(intersection[i] + " ");
		}
		System.out.println();
		sc.close();
	}
}


