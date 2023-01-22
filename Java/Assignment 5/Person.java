import java.util.Scanner;

class Person{
	private String name;
	private int age;

	void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");	
		name = sc.next();
		System.out.print("Enter age: ");	
		age = sc.nextInt();
		sc.close();
	}

	void display(){
		System.out.println("Name: "+name);	
		System.out.println("Age: "+age);
	}
}

class Student extends Person{
	private float marks;

	//Setter
	void setMarks(float marks){
		this.marks = marks;
	}
	
	//Getter
	float getMarks(){
		return marks;	
	}
	void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student's Details..");
		super.accept();
		System.out.print("Enter Marks: ");
		marks = sc.nextFloat();
		sc.close();
	}

	void display(){
		System.out.println("Student's Details..");
		super.display();
		System.out.println("Marks: "+marks);
	}
}

class Teacher extends Person{
	private float salary;

	//Setter
	void setSalary(float salary){
		this.salary = salary;
	}
	
	//Getter
	float getSalary(){
		return salary;	
	}

	void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Teacher's Details..");
		super.accept();
		System.out.print("Enter Salary: ");
		salary = sc.nextFloat();
		sc.close();
	}

	void display(){
		System.out.println("Teacher's Details..");
		super.display();
		System.out.println("Salary: "+salary);
	}
}

