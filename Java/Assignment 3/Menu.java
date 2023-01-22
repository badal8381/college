import java.util.Scanner;

class Menu{
	public static int factorial(int n){
		if(n<=0)
			return 1;
		return n*factorial(n-1);
	}

	public static void checkArmstrong(int n){
		int original=n;
		int result=0;
		while(n!=0){
			result += Math.pow(n%10, 3);
			n = n/10;
		}
		if(original == result)
			System.out.println("\n"+ original+" is Armstrong..");
		else
			System.out.println("\n"+ original+" is not Armstrong..");
	}

	public static void checkPalindrom(int n){
		String original = ""+n;
		String reverse = "";
		for(int j=original.length()-1; j>=0; j--){
			reverse += original.charAt(j);
		}
		
		if(original.compareTo(reverse)==0)
			System.out.println("\n"+ original+" is Palindrom..");
		else
			System.out.println("\n" + original+" is not Palindrom..");
	}

	public static void fibonacci(int n){
		int firstTerm=0; 
		int secondTerm=1;
		System.out.print("\nFibonacci series till "+n+"th term is: ");
		for(int i=0; i<n; i++){
			System.out.print(firstTerm+" ");
			int nextTerm = firstTerm+secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		System.out.println();
	}

	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("Menu");
			System.out.println("1. Find factorial");
			System.out.println("2. Check Armstsrong");
			System.out.println("3. Check Palindrom");
			System.out.println("4. Find Fibonacci");
			System.out.print("Enter your choice (-1 to stop): ");
			choice = sc.nextInt();
			switch(choice){
				case 1:System.out.println("Factorial is: "+factorial(num));
				       break;
				case 2:checkArmstrong(num);
				       break;
				case 3:checkPalindrom(num);
				       break;
				case 4:fibonacci(num);
				       break;
			}

		}while(choice!=-1);

		sc.close();		
	}
}
