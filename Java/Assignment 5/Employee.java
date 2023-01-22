abstract class Employee{
	int eno;
	String ename;
	float salary;

	abstract void net_salary();
	
	void display(){
		System.out.print("Employee no: "+eno);
		System.out.print("Employee Name: "+ename);
		System.out.print("Employee Salary: "+salary);
	}
}

class Manager extends Employee{
	Manager(){
		eno = 0;
		ename = "";
		salary = 0.0f;
	}


	Manager(int eno, String ename, float salary){
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}

	void net_salary(){
		if (salary>=150000 && salary < 300000){
			salary = salary-(salary*(5/100));
		}else if (salary >= 300000 && salary < 500000){
			salary = salary-(salary*(5/100));
			
		}
	}

	void display(){
		System.out.println("Employee no: "+eno);
		System.out.println("Manager Name: "+ename);
		System.out.println("Manager Salary: "+salary);	
	}
}

class Clerk extends Employee{

	Clerk(){
		eno = 0;
		ename = "";
		salary = 0.0f;
	}

	Clerk(int eno, String ename, float salary){
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}

	void net_salary(){

	}

	void display(){
		System.out.println("Employee no: "+eno);
		System.out.println("Clerk Name: "+ename);
		System.out.println("Clerk Salary: "+salary);	
	}
}
