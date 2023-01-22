package maths;

public class MathsOperations{
	public static void max(int a, int b, int c){
		if(a > b && a > c)
			System.out.println(a + " is Maximum");
		else if(b > a && b > c)
			System.out.println(b + " is Maximum");
		else
			System.out.println(c + " is Maximum");
	}

	public static void min(int a, int b, int c){
		if(a < b && a < c)
			System.out.println(a + " is Minimum");
		else if(b < a && b < c)
			System.out.println(b + " is Minimum");
		else
			System.out.println(c + " is Minimum");
	}
}
