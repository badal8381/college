import java.util.Scanner;

class StringContainsNumberException extends Exception{
	StringContainsNumberException(String message){
		super(message);
	}
}

class StringLengthLessException extends Exception{
	StringLengthLessException(String message){
		super(message);
	}
}

class StringLengthMoreException extends Exception{
	StringLengthMoreException(String message){
		super(message);
	}
}

class Question6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = sc.next();

		try{
			try{
				if(!s.matches("[A-Za-z]+"))
					throw new StringContainsNumberException("String have number..");
			}catch(StringContainsNumberException ex){
				System.out.println(ex);
			}

			try{
				if(s.length() < 8)
					throw new StringLengthLessException("String length is less than 8...");
			
			}catch(StringLengthLessException ex){
				System.out.println(ex);
			}

			if(s.length() > 30)
				throw new StringLengthMoreException("String length is greater than 30...");
		}catch(StringLengthMoreException ex){
			System.out.println(ex);
		}

	}

}
