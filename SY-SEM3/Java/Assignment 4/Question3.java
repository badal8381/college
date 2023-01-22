import java.util.*;
/**
 *	@author Badal "I am the Author"
 *	@version 1.0
 *
 */
public class Question3{
/**
 *	@param arr "Array of Person"
 */
	public static void sortOnName(Person1 arr[]){
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i].pname.compareTo(arr[j].pname) > 0){
					Person1 temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
/**
 *	@param arr "Array of Person" 
 */
	public static void sortOnMobile(Person1 arr[]){
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i].mobileno > arr[j].mobileno){
					Person1 temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		Person1 p[] = new Person1[n];
		
		for(int i = 0; i<p.length; i++){
			System.out.print("Enter Name: ");
			String name = sc.next();
			System.out.print("Enter Address: ");
			String address = sc.next();
			System.out.print("Enter Mobile No: ");
			double mobileno = sc.nextDouble();
			System.out.print("Enter Email ID: ");
			String email = sc.next();
			System.out.print("Enter UID: ");
			int uid = sc.nextInt();
			//Creating object of Person Class
			p[i] = new Person1(name, address, mobileno, email, uid);
		}
		System.out.println();	
		System.out.println("Before Soting..");	
		for(int i = 0; i<p.length; i++){
			p[i].display();
		}

		sortOnName(p);
		System.out.println();	
		System.out.println("After Soting on Name....");
		for(int i = 0; i<p.length; i++){
			p[i].display();
		}
		sortOnMobile(p);
		System.out.println();	
		System.out.println("After Soting on Mobile NO...");
		for(int i = 0; i<p.length; i++){
			p[i].display();
		}
		sc.close();
	}
}
