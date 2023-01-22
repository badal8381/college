import java.util.*;

public class OddEven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int odd[] = new int[20];
		int even[] = new int[20];
		int num, i=0, j=0;
		do{
			System.out.print("Enter Numbers (-1 to stop): ");
			num = sc.nextInt();
			if(num%2!=0)
				odd[j++] = num;
			else
				even[i++] = num;
		}while(num!=-1);

		System.out.print("Odd Numbers: ");
		for(int n=0; n<j; n++)
			System.out.print(odd[n]+" ");
			
		System.out.println();
		System.out.print("Even Numbers: ");
		for(int n=0; n<i; n++)
			System.out.print(even[n]+" ");
		System.out.println();
		sc.close();
	}
}


