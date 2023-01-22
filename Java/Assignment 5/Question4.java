import java.util.*;
class Question4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("Menu..");
			System.out.println("1. Manager");
			System.out.println("2. Clerk");
			System.out.print("Enter Choice (-1 to stop): ");
			choice = sc.nextInt();

			switch(choice){
				case 1: System.out.print("Enter Employee no: ");
					int eno = sc.nextInt();
					System.out.print("Enter Manager name: ");
					String name = sc.next();
					System.out.print("Enter Manager salary: ");
					float salary = sc.nextFloat();
					Manager m = new Manager(eno, name, salary);
					m.display();
					System.out.println();
					break;
				
				case 2: System.out.print("Enter Employee no: ");
					eno = sc.nextInt();
					System.out.print("Enter Clerk name: ");
					name = sc.next();
					System.out.print("Enter Clerk salary: ");
					salary = sc.nextFloat();
					Clerk c = new Clerk(eno, name, salary);
					c.display();
					System.out.println();
					break;
				
			}
		}while(choice != -1);
		sc.close();
	} 

}
