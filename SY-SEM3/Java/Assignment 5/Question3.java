import java.util.Scanner;

class Question3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("Menu");
			System.out.println("1. Teacher");
			System.out.println("2. Student");
			System.out.print("Enter choice (-1 to stop): ");
			choice = sc.nextInt();
			switch(choice){
				case 1: Teacher t = new Teacher();
					t.accept();
					t.display();
					break;
				case 2: Student s = new Student();
					s.accept();
					s.display();
					break;
			}
		}while(choice!=-1);
		sc.close();
	}
}
