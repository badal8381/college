package stats;

public class StatsOperations{
	static float average(int a, int b, int c){
		return ((a+b+c)/3);
	}

	static void median(int a, int b, int c){
		if(a > b && a < c)
			System.out.println(a + " is Median");
		else if(b > a && b < c)
			System.out.println(b + " is Median");	
		else
			System.out.println(c + " is Median");
	}
}
