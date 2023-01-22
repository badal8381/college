import java.util.*;
class Question1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
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
		Person p = new Person(name, address, mobileno, email, uid);
		p.display();
		sc.close();
	}
}
