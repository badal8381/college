class MyNumber{
	private int data;

	MyNumber(){
		data = 0;
	}

	MyNumber(int data){
		this.data = data;
	}

	void isNegative(){
		if(data<0)
			System.out.println("Negative..");
		else
			System.out.println("Not Negative..");
	}
	void isPositive(){
		if(data>=0)
			System.out.println("Positive..");
		else
			System.out.println("Not Positive..");
	}
	void isZero(){
		if(data==0)
			System.out.println("Zero..");
		else
			System.out.println("Not Zero..");
	}
	void isOdd(){
		if(data%2==1)
			System.out.println("Odd...");
		else
			System.out.println("Not Odd..");
	}
	void isEven(){
		if(data%2==0)
			System.out.println("Even...");
		else
			System.out.println("Not Even..");
	}
}
