import java.io.*;
import java.util.Scanner;

class Employee{
	int id;
	String name;
	int salary;
	String designation;

	Employee(){
		id = 0;
		name = "";
		salary = 0;
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
	public static int countEmp(File file) throws IOException{
		RandomAccessFile raf = new RandomAccessFile(file, "r");
		int i=0;
		while(raf.readLine()!=null){
			i++;
		}
		raf.close();
		return i;
	}
}

class Question4{
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		RandomAccessFile raf = new RandomAccessFile("emp.dat", "rwd");


		int size = 0;

		int choice = 1;
		do{
			System.out.print("\nEnter ID: ");
			raf.writeInt(sc.nextInt());
			System.out.print("\nEnter Name: ");
			raf.writeUTF(sc.next());
			System.out.print("\nEnter Salary: ");
			raf.writeInt(sc.nextInt());
			System.out.print("\nEnter Designation: ");
			raf.writeUTF(sc.next());
			size++;
			System.out.print("\nEnter -1 to stop (1 to continue): ");
			choice = sc.nextInt();
		}while(choice!=-1);
		raf.close();
		raf = new RandomAccessFile("emp.dat", "r");
		Employee e[] = new Employee[size];

		//inserting file data into employee object array
		for(int i=0; i<e.length-1; i++){
			e[i] = new Employee();
			e[i].id = raf.readInt();
			e[i].name = raf.readUTF();
			e[i].salary = raf.readInt();
			e[i].designation = raf.readUTF();
		}
		raf.close();
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
			sc.close();
		}while(choice!=-1);
	}
}
