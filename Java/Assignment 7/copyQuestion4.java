import java.io.*;
import java.util.Scanner;

class Employee{
	int id;
	String name;
	float salary;
	String designation;

	Employee(){
		id = 0;
		name = "";
		salary = 0.0f;
		designation = "";
	}

	void display(){
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+designation);
		System.out.println();
	}
	//method to get total lines in file
	public static int countEmp(File file) throws FileNotFoundException{
		Scanner sc = new Scanner(new FileInputStream(file));
		int i=0;
		while(sc.hasNextLine()){
			sc.nextLine();
			i++;
		}
		sc.close();
		return i;
	}
}

class Question4{
	public static void main(String[] args) throws FileNotFoundException{
		File newFile = new File("emp.dat");
		Scanner sc = new Scanner(new FileInputStream(newFile));

		int size = Employee.countEmp(newFile);
		Employee e[] = new Employee[size];
	
		//inserting file data into employee object array
		for(int i=0; i<e.length; i++){
			e[i] = new Employee();
			e[i].id = sc.nextInt();
			e[i].name = sc.next();
			e[i].salary = sc.nextFloat();
			e[i].designation = sc.next();
		}
		sc.close();

		int choice;
		do{
			sc = new Scanner(System.in);
			System.out.println("Menu: ");
			System.out.println("1. Search for a specific employee by name:  ");
			System.out.println("2. Find maximum salary: ");
			System.out.println("3. Display all employee details: ");
			System.out.print("Enter choice (-1 to stop): ");
			choice = sc.nextInt();

			switch(choice){
				case 1: System.out.print("Enter Employee name to Search: ");
					String name = sc.next();
					for(int i=0; i<e.length; i++){
						if(e[i].name.compareTo(name) == 0){
							System.out.println("\nEmployee Found..\n");
							System.out.println("Employee details are..");
							e[i].display();
						}
					}
					break;

				case 2: float max = -1;
					for(int i=0; i<e.length; i++)
						max = Math.max(max, e[i].salary);

					System.out.println("\nMaximum Salary: "+max);
					break;

				case 3: System.out.println("\nDetails of all Employee is following..\n");
					for(int i=0; i<e.length; i++)
						e[i].display();

					break;
			}
		}while(choice!=-1);
		sc.close();
	}
}
