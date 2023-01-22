package series;

class Prime{
	public static boolean checkPrime(int n){
		for(int i=2; i<n; i++){
			if((n%i)==0)
				return false;
		}
		return true;
	}
	
	public static void printPrime(int n){
		System.out.print("Prime numbers: ");
		for(int i=2; i<n; i++){
			if(checkPrime(i)){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}

class Fibonacci{
	public static int fibonacci(int n){
		if(n==0 || n==1)
			return 1;
		return fibonacci(n-1) + fibonacci(n-2);		
	}
	public static void printFibonacci(int n){
		System.out.print("Fibonacci numbers: ");
		for(int i=0; i<n; i++)
			System.out.print(fibonacci(i)+" ");
		System.out.println();
	}
}

class Perfect{
	public static boolean perfect(int n){
		int sum = 0;
		if(n==0)
			return false;

		for(int i = 1; i<n; i++){
			if(n%i == 0){
				sum+=i;
			}	
		}
		
		if(sum==n)
			return true;
		return false;
	}
	
	public static void printPerfect(int n){
		System.out.print("Perfect numbers: ");
		for(int i=0; i<n; i++){
			if(perfect(i)){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
