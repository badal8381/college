import maths.*;
import stats.*;

class Question6{

	public static void main(String[] args){
		if(args.length!=3){
			System.out.println("Invalid number of Arguments..");
			System.exit(0);
		}
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		MathsOperations.max(a,b,c);		
		MathsOperations.min(a, b, c);

		StatsOperations.average(a, b, c);
		StatsOperations.median(a, b, c);
	}
}
