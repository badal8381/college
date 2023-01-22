import java.util.*;

public class Matrix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice;

		do{
			System.out.println("Menu: ");
			System.out.println("1. Addition");
			System.out.println("2. Multiplication");
			System.out.println("3. Transpose");
			System.out.println("Enter -1 to Stop");
			choice = sc.nextInt();
			if(choice == 1){	
				System.out.print("Enter dimensions of matrix: ");
				int m = sc.nextInt();
				int n = sc.nextInt();
				int arr1[][] = new int[m][n];
				int arr2[][] = new int[m][n];	
				int sum[][] = new int[m][n];	
		
				System.out.println("Enter elements of 1st matrix: ");
				for(int i=0; i<m; i++){
					for(int j=0; j<n; j++)
						arr1[i][j] = sc.nextInt();
				}
		
				System.out.println("Enter elements of 2nd matrix: ");
				for(int i=0; i<m; i++){
					for(int j=0; j<n; j++)
						arr2[i][j] = sc.nextInt();
				}
				//Addition
				for(int i=0; i<m; i++){
					for(int j=0; j<n; j++)
						sum[i][j] = arr1[i][j] + arr2[i][j];
				}
				//Printing Array
				System.out.println("Addition matrix is: ");
				for(int i=0; i<m; i++){
					for(int j=0; j<n; j++)
						System.out.print(sum[i][j]+" ");
					System.out.println();
				}
			}
			if(choice==2){
				System.out.print("Enter dimensions of 1st matrix: ");
				int m = sc.nextInt();
				int n = sc.nextInt();
				System.out.print("Enter dimensions of 2nd matrix: ");
				int o = sc.nextInt();
				int p = sc.nextInt();

				if(n!=o){
					System.out.println("Dimensions are invalid..");
					continue;
				}
				int arr1[][] = new int[m][n];
				int arr2[][] = new int[o][p];	
				int prod[][] = new int[m][p];	
		
				System.out.println("Enter elements of 1st matrix: ");
				for(int i=0; i<m; i++){
					for(int j=0; j<n; j++)
						arr1[i][j] = sc.nextInt();
				}
		
				System.out.println("Enter elements of 2nd matrix: ");
				for(int i=0; i<o; i++){
					for(int j=0; j<p; j++)
						arr2[i][j] = sc.nextInt();
				}
				//Multiplication
				for(int i=0; i<m; i++){
					for(int j=0; j<p; j++){
						prod[i][j] = 0;
						for(int k=0; k<o; k++){
							prod[i][j] += arr1[i][k]*arr2[k][j];
						}

					}
				}
				//Printing Array
				System.out.println("Multiplication Array is..");
				for(int i=0; i<m; i++){
					for(int j=0; j<p; j++)
						System.out.print(prod[i][j]+" ");
					System.out.println();
				}
			}
			if(choice==3){
				System.out.print("Enter dimensions of matrix: ");
				int m = sc.nextInt();
				int n = sc.nextInt();
				int arr1[][] = new int[m][n];
				int transpose[][] = new int[n][m];
	
				System.out.println("Enter elements of matrix: ");
				for(int i=0; i<m; i++){
					for(int j=0; j<n; j++)
						arr1[i][j] = sc.nextInt();
				}

				//Finding Transpose
				for(int i=0; i<m; i++){
					for(int j=0; j<n; j++)
						transpose[j][i] = arr1[i][j];
				}

				//Printing Array
				System.out.println("Transpose Matrix..");
				for(int i=0; i<transpose.length; i++){
					for(int j=0; j<transpose[i].length; j++)
						System.out.print(transpose[i][j]+" ");
					System.out.println();
				}
				
			}
		}while(choice!=-1);

		sc.close();
	}
}


